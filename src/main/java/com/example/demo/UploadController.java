package com.example.demo;

import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class UploadController {

    @Value("${azure.storage.accountName}")
    private String accountName;

    @Value("${azure.storage.accountKey}")
    private String accountKey;

    @Value("${azure.storage.containerName}")
    private String containerName;

    @GetMapping("/")
    public String showUploadForm() {
        return "upload";
    }

    @PostMapping("/yuhuijing.azurewebsites.net")
    public String uploadResume(@RequestParam("resume") MultipartFile file, Model model) throws IOException {
        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
                .connectionString("DefaultEndpointsProtocol=https;AccountName=" + accountName + ";AccountKey=" + accountKey + ";EndpointSuffix=core.windows.net")
                .buildClient();

        InputStream content = file.getInputStream();
        blobServiceClient.getBlobContainerClient(containerName)
                .getBlobClient(file.getOriginalFilename())
                .getBlockBlobClient()
                .upload(content, content.available());

        model.addAttribute("message", "简历上传成功！");
        return "upload";
    }
}
