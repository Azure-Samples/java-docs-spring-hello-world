package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.Dao.ChildDao;
import com.example.demo.Dao.SponsorDao;

import Entity.Child;
import Entity.Sponsor;

@WebServlet("/Childs")
public class ChildList_Servlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req,resp);
	}
	
	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try(ChildDao dao = new ChildDao()){
			List<Child> child_List = new ArrayList<>();
			PrintWriter out = resp.getWriter();
            resp.setContentType("text/html");
            out.print("<html><body><h2>Sponsors</h2>");
            out.print("<table border=1 cellspacing=2 cellpadding=2>");
            out.print("<th>child_first_name</th>");
            out.print("<th> child_last_name</th>");
            out.print("<th>child_DOB</th>");
            out.print("<th>child_mother_name</th>");
            out.print("<th>child_father_name</th>");
            out.print("<th>child_gender</th>");
            out.print("<th>child_nationality</th>");
            out.print("<th>adoption_status</th>");
            out.print("<th>orphanage_id</th>");
            out.print("<th>child_image</th>");
            out.print("<th>child_contact_no</th>");
            out.print("<th>child_email</th>");
            out.print("<th>child_govt_id</th>");
            out.print("<th>entry_date</th>");
            
            child_List = dao.AllChilds();
            for(Child c: child_List) {
                out.print("<tr>");
                out.print("<td>" + c.getChild_first_name()+ "</td>");
                out.print("<td>" + c.getChild_last_name()+ "</td>");
                out.print("<td>" + c.getChild_DOB()+ "</td>");
                out.print("<td>" + c.getChild_mother_name()+ "</td>");
                out.print("<td>" + c.getChild_father_name()+ "</td>");
                out.print("<td>" + c.getChild_gender()+ "</td>");
                out.print("<td>" + c.getChild_nationality()+ "</td>");
                out.print("<td>" + c.getAdoption_status()+ "</td>");
                out.print("<td>" + c.getOrphanage_id()+ "</td>");
                out.print("<td>" + c.getChild_image()+ "</td>");
                out.print("<td>" + c.getChild_contact_no()+ "</td>");
                out.print("<td>" + c.getChild_email()+ "</td>");
                out.print("<td>" + c.getChild_govt_id()+ "</td>");
                out.print("<td>" + c.getEntry_date()+ "</td>");
                out.print("</tr>");
            }
            out.print("</table></body><br/>");
           
            out.print("</html>");
            
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
