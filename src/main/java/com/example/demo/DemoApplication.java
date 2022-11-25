package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.AdminDao;
import Dao.SponsorDao;
import Entity.Admin;
import Entity.Sponsor;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	WebServlet Login;
}

@WebServlet("/Login")
class OMS extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	PrintWriter out;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			processRequest(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			processRequest(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String aemail = req.getParameter("aemail");
		String apassword = req.getParameter("apasswd");
		
		String semail = req.getParameter("semail");
		String spassword = req.getParameter("spasswd");
		
		System.out.println(aemail+apassword+semail+spassword);
		
		if(req.getParameter("login").equals("Admin_Sign_In")) {
			try(AdminDao dao = new AdminDao()){
			Admin admin = dao.findByEmail(aemail);
			if(admin!=null && admin.getAdmin_password().equals(apassword)) {
				Cookie c1 = new Cookie("aid", Integer.toString(admin.getAdmin_id()));
				c1.setMaxAge(36000);
				resp.addCookie(c1);
				
				HttpSession session = req.getSession();
				session.setAttribute("user", admin);
				resp.sendRedirect("AdminHome");
				}else resp.sendError(403, "Forbidden");
			}catch (Exception e) {e.printStackTrace();}
		}
		
		if(req.getParameter("login").equals("Sponsor_Sign_In")) {
			try(SponsorDao dao = new SponsorDao()){
			Sponsor sponsor = dao.findByEmail(semail);
			if(sponsor!=null && sponsor.getSponsor_password().equals(spassword)) {
				Cookie c2 = new Cookie("sid", Integer.toString(sponsor.getSponsor_id()));
				c2.setMaxAge(36000);
				resp.addCookie(c2);
				
				HttpSession session = req.getSession();
				session.setAttribute("user", sponsor);
				resp.sendRedirect("SponsorHome");
			}else resp.sendError(403, "Forbidden");
			}catch (Exception e) {e.printStackTrace();}
		}
			else {
			 resp.setContentType("text/html");
			 out = resp.getWriter();
			 out.println("<html>");
		        out.println("<head>");
		        out.println("<title>Login Failed</title>");
		        out.println("</head>");
		        out.println("<body>");
		        out.println("<h4>Invalid email or password.</h4>");
		        out.println("<a href='Index.html'>Login Again</a>");
		        out.println("</body>");
		        out.println("</html>");
		}

	}

}
