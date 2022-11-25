package com.example.demo.Dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import Entity.Admin;
import Entity.Child;
import Entity.Sponsor;

public class ChildDao implements AutoCloseable{
	private Connection con;
	private static List<Child> child_List;
	
	public ChildDao() throws Exception {
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
	
	public List<Child> AllChilds() throws Exception{
		String sql = "SELECT * FROM child";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			Child child;
			child_List = new ArrayList<>();
				while(rs.next()) {
					child = new Child(
					rs.getInt("child_id"), 
					rs.getString("child_first_name"), 
					rs.getString("child_middle_name"),
					rs.getString("child_last_name"), 
					rs.getString("child_DOB"), 
					rs.getString("date_admitted"), 
					rs.getString("child_mother_name"), 
					rs.getString("child_father_name"), 
					rs.getString("child_gender"), 
					rs.getString("child_nationality"),
					rs.getString("adoption_status"), 
					rs.getInt("orphanage_id"),
					rs.getString("child_image"), 
					rs.getString("child_contact_no"), 
					rs.getString("child_email"),
					rs.getString("child_govt_id"), 
					rs.getString("entry_date"));
					child_List.add(child);
				}
		}
		return child_List;
	}
	
	public Child findByEmail(String email) throws Exception{
		String sql = "SELECT * FROM sponsor where child_email=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, email);
			try(ResultSet rs = stmt.executeQuery()) {
				Child child = new Child();
				if(rs.next()) {
					child.setChild_id(rs.getInt("sponsor_id"));
					child.setChild_first_name(rs.getString("sponsor_first_name"));
					child.setChild_middle_name(rs.getString("sponsor_middle_name"));
					child.setChild_last_name(rs.getString("sponsor_last_name"));
					child.setChild_DOB(rs.getString("sponsor_nationality"));
					child.setDate_admitted(rs.getString("sponsor_gender"));
					child.setChild_mother_name(rs.getString("sponsor_contact_no"));
					child.setChild_father_name(rs.getString("sponsor_email"));
					child.setChild_gender(rs.getString("sponsor_password"));
					child.setChild_nationality(rs.getString("sponsor_govt_id"));
					child.setAdoption_status(rs.getString("sponsorship_id"));
					child.setOrphanage_id(rs.getInt("sponsorship_description"));
					child.setChild_image(rs.getString("sponsor_image"));
					child.setChild_contact_no(rs.getString("sponsor_entry_date"));
					child.setChild_email(rs.getString("sponsor_entry_date"));
					child.setChild_govt_id(rs.getString("sponsor_entry_date"));
					child.setEntry_date(rs.getString("sponsor_entry_date"));
					return child;
				}
			} 
		}
		return null;
	}

	public int register(Child child) throws Exception{
		int cnt = -1;
		String sql = "insert into child(child_first_name,child_last_name,sponsor_nationality,sponsor_gender,sponsor_contact_no,sponsor_email,sponsor_password) values(?,?,?,?,?,?,?)";
		
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, child.getChild_first_name());
			stmt.setString(2, child.getChild_last_name());
			stmt.setString(3, child.getChild_DOB());
			stmt.setString(4, child.getChild_mother_name());
			stmt.setString(5, child.getChild_father_name());
			stmt.setString(6, child.getChild_gender());
			stmt.setString(7, child.getChild_nationality());
			stmt.setInt(8, child.getOrphanage_id());
			stmt.setString(9, child.getChild_contact_no());
			stmt.setString(10, child.getChild_email());
			
			cnt = stmt.executeUpdate();
		} 
		return cnt;
		}
}
