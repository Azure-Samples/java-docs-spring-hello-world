package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.Dao.AdminDao;
import com.example.demo.Dao.HomeDao;

import Entity.Admin;

@WebServlet("/AdminHome")
public class AdminHomeServlet extends HttpServlet{
	
	PrintWriter out;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req,resp);
	}
	
	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HomeDao dao = new HomeDao();
		
		resp.setContentType("text/html");
		out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<h1>Orphanage Management System Admin Home</h1>");
		out.println("<title>Home Page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1></h1>");
		out.println("<a href='OrphanageDetails'>Orphanage Details</a>");
		out.println("</body>");
		out.println("</html>");
		
		resp.setContentType("text/html");
		out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Home Page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1></h1>");
		out.println("<a href='Sponsors'>Sponsors List</a>");
		out.println("</body>");
		out.println("</html>");
		
		resp.setContentType("text/html");
		out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Home Page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1></h1>");
		out.println("<a href='SponsorReg'>Register New Sponsor</a>");
		out.println("</body>");
		out.println("</html>");
		
		resp.setContentType("text/html");
		out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Home Page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1></h1>");
		out.println("<a href='Childs'>Child List</a>");
		out.println("</body>");
		out.println("</html>");
			 
	}

}
