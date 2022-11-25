package servlets;

import javax.servlet.annotation.WebServlet;
import java.awt.print.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.Dao.SponsorDao;

import Entity.Sponsor;

@WebServlet("/Sponsors")
	public class SponsorList_Servlet extends HttpServlet {
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			processRequest(req, resp);
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			processRequest(req, resp);
		}
		
		protected void adding(Sponsor sponsor) {
			
			
		}
		protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			try(SponsorDao dao = new SponsorDao()){
			List<Sponsor> sponsor_List = new ArrayList<>();
			PrintWriter out = resp.getWriter();
            resp.setContentType("text/html");
            out.print("<html><body><h2>Sponsors</h2>");
            out.print("<table border=1 cellspacing=2 cellpadding=2>");
            out.print("<th>sponsor_first_name</th>");
            out.print("<th> sponsor_last_name</th>");
            out.print("<th>sponsor_nationality</th>");
            out.print("<th>sponsor_gender</th>");
            out.print("<th>sponsor_contact_no</th>");
            out.print("<th>sponsor_email</th>");
            out.print("<th>sponsor_password</th>");
            out.print("<th>sponsor_govt_id</th>");
            out.print("<th>sponsor_entry_date</th>");
             
            
            sponsor_List = dao.AllSponsors();
            for(Sponsor s: sponsor_List) {
                out.print("<tr>");
                out.print("<td>" + s.getSponsor_first_name()+ "</td>");
                out.print("<td>" + s.getSponsor_last_name()+ "</td>");
                out.print("<td>" + s.getSponsor_nationality()+ "</td>");
                out.print("<td>" + s.getSponsor_gender()+ "</td>");
                out.print("<td>" + s.getSponsor_contact_no()+ "</td>");
                out.print("<td>" + s.getSponsor_email()+ "</td>");
                out.print("<td>" + s.getSponsor_password()+ "</td>");
                out.print("<td>" + s.getSponsor_govt_id()+ "</td>");
                out.print("<td>" + s.getSponsor_entry_date()+ "</td>");
                out.print("</tr>");
            }
            out.print("</table></body><br/>");
           
            out.print("</html>");
            
		}catch (Exception e) {
			e.printStackTrace();
		}	
		}

}
