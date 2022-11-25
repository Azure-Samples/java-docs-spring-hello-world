package com.example.demo.Dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import Entity.Admin;
import Entity.Sponsor;

public class AdminDao implements AutoCloseable{
	
	private Connection con;
	private static List<Admin> admin_List = new ArrayList<>();
	
	public AdminDao() throws Exception {
		con = DbUtil.getConnection();
	}
	
	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
		}
	}
	
	public List<Admin> AllAdmins() throws Exception{
		String sql = "SELECT * FROM admin";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			try(ResultSet rs = stmt.executeQuery()) {
				Admin admin = new Admin();
				while(rs.next()) {
					admin.setAdmin_id(rs.getInt("admin_id"));
					admin.setAdmin_first_name(rs.getString("admin_first_name"));
					admin.setAdmin_middle_name(rs.getString("admin_middle_name"));
					admin.setAdmin_last_name(rs.getString("admin_last_name"));
					admin.setNationality(rs.getString("nationality"));
					admin.setGender(rs.getString("gender"));
					admin.setAdmin_contact_no(rs.getString("admin_contact_no"));
					admin.setAdmin_email(rs.getString("admin_email"));
					admin.setAdmin_password(rs.getString("admin_password"));
					admin.setAdmin_govt_id(rs.getString("admin_govt_id"));
					admin.setAdmin_occupation(rs.getString("admin_occupation"));
					admin.setVolunteer_id(rs.getInt("volunteer_id"));
					admin.setEntry_date(rs.getString("entry_date"));
					admin_List.add(admin);
				}
			} 
		} 

		
		
		return admin_List;
		
	}
	
	public Admin findByEmail(String email) throws Exception{
		String sql = "SELECT * FROM admin where admin_email=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, email);
			try(ResultSet rs = stmt.executeQuery()) {
				Admin admin = new Admin();
				if(rs.next()) {
					admin.setAdmin_id(rs.getInt("admin_id"));
					admin.setAdmin_first_name(rs.getString("admin_first_name"));
					admin.setAdmin_middle_name(rs.getString("admin_middle_name"));
					admin.setAdmin_last_name(rs.getString("admin_last_name"));
					admin.setNationality(rs.getString("nationality"));
					admin.setGender(rs.getString("gender"));
					admin.setAdmin_contact_no(rs.getString("admin_contact_no"));
					admin.setAdmin_email(rs.getString("admin_email"));
					admin.setAdmin_password(rs.getString("admin_password"));
					admin.setAdmin_govt_id(rs.getString("admin_govt_id"));
					admin.setAdmin_occupation(rs.getString("admin_occupation"));
					admin.setVolunteer_id(rs.getInt("volunteer_id"));
					admin.setEntry_date(rs.getString("entry_date"));
					return admin;
				}
			} 
		}
		return null;
	}
}
