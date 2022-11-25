package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.Dao.SponsorDao;

import Entity.Sponsor;

@WebServlet("/SponsorReg")
public class RegSponsorServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.print("<html><body><h2>Register a new Sponsor</h2>");
        out.print("<table border=1 cellspacing=2 cellpadding=2>");
        out.print("<form method=\"post\" action=\"SponsorReg\">");
        out.print("<br><tr>First Name: <input type=\"text\" name=\"sponsor_first_name\"/></tr></br>");
        out.print("<br><tr>Last Name: <input type=\"text\" name=\"sponsor_last_name\"/></tr></br>");
        out.print("<br><tr>Contact No: <input type=\"text\" name=\"sponsor_contact_no\"/></tr></br>");
        out.print("<br><tr>Nationality: <input type=\"text\" name=\"sponsor_nationality\"/></tr></br>");
        out.print("<br><tr>Gender: <input type=\"text\" name=\"sponsor_gender\"/></tr></br>");
        out.print("<br><tr>Email ID: <input type=\"text\" name=\"sponsor_email\"/></tr></br>");
        out.print("<br><tr>Password: <input type=\"text\" name=\"sponsor_password\"/></tr></br>");
        out.print("<input type=\"submit\" value=\"ADD\"/>");
        out.print("</form>");
		out.print("</table></body><br/>");
		out.print("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try(SponsorDao dao = new SponsorDao()){
		Sponsor sponsor = new Sponsor(req.getParameter("sponsor_first_name"),req.getParameter("sponsor_last_name"),req.getParameter("sponsor_contact_no"),req.getParameter("sponsor_nationality"),req.getParameter("sponsor_gender"),req.getParameter("sponsor_email"),req.getParameter("sponsor_password"),req.getParameter("sponsor_govt_id"));
		dao.register(sponsor);
		}catch (Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = req.getRequestDispatcher("Sponsors");
		rd.forward(req, resp);
		
	}

}
