package com.example.demo.Dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/OrphanageDetails")
public class OrphanageDao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Context ctx = null;
		Connection con = null;
		PreparedStatement prpstmt = null;
		ResultSet rs = null;
		try{
			ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/MyLocalDB");
			
			con = ds.getConnection();
			prpstmt = con.prepareStatement("select * from orphanage");
			
			rs = prpstmt.executeQuery();
			
			PrintWriter out = resp.getWriter();
            resp.setContentType("text/html");
            out.print("<html><body><h2>Orphanage Details</h2>");
            out.print("<table border=1 cellspacing=2 cellpadding=2>");
            out.print("<th>orphanage_id</th>");
            out.print("<th>agency_code</th>");
            out.print("<th>orphanage_name</th>");
            out.print("<th>orphanage_location</th>");
            out.print("<th>postcode</th>");
            out.print("<th>contact_person</th>");
            out.print("<th>phone_no</th>");
            out.print("<th>mobile_no</th>");
            out.print("<th>email</th>");
            out.print("<th>in_home</th>");
            out.print("<th>adoptable</th>");
            out.print("<th>boys</th>");
            out.print("<th>girls</th>");
            out.print("<th>orphanage_image_galary</th>");
            out.print("<th>entry_date</th>");
           
            
            while(rs.next())
            {
                out.print("<tr>");
                out.print("<td>" + rs.getInt("orphanage_id") + "</td>");
                out.print("<td>" + rs.getString("agency_code") + "</td>");
                out.print("<td>" + rs.getString("orphanage_name") + "</td>");
                out.print("<td>" + rs.getString("orphanage_location") + "</td>");
                out.print("<td>" + rs.getString("postcode") + "</td>");
                out.print("<td>" + rs.getString("contact_person") + "</td>");
                out.print("<td>" + rs.getString("phone_no") + "</td>");
                out.print("<td>" + rs.getString("mobile_no") + "</td>");
                out.print("<td>" + rs.getString("email") + "</td>");
                out.print("<td>" + rs.getString("in_home") + "</td>");
                out.print("<td>" + rs.getString("adoptable") + "</td>");
                out.print("<td>" + rs.getString("boys") + "</td>");
                out.print("<td>" + rs.getString("girls") + "</td>");
                out.print("<td>" + rs.getString("orphanage_image_galary") + "</td>");
                out.print("<td>" + rs.getString("entry_date") + "</td>");
                out.print("</tr>");
            }
            out.print("</table></body><br/>");
            
            //lets print some DB information
            out.print("<h3>Database Details</h3>");
            out.print("Database Product: "+con.getMetaData().getDatabaseProductName()+"<br/>");
            out.print("Database Driver: "+con.getMetaData().getDriverName());
            out.print("</html>");
            
		}catch(Exception e){
			e.printStackTrace();
		} finally{
			try {
				rs.close();
				prpstmt.close();
				con.close();
				ctx.close();
			} catch (SQLException e) {
				System.out.println("Exception in closing DB resources");
			} catch (NamingException e) {
				System.out.println("Exception in closing Context");
			}
			
		}

	}

}
