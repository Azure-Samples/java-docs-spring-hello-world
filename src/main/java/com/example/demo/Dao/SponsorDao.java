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
import Entity.Sponsor;

public class SponsorDao implements AutoCloseable{
	private Connection con;
	private static List<Sponsor> sponsor_List;
	
	public SponsorDao() throws Exception {
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
	
	public List<Sponsor> AllSponsors() throws Exception{
		String sql = "SELECT * FROM sponsor";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			Sponsor sponsor;
			sponsor_List = new ArrayList<>();
				while(rs.next()) {
					sponsor = new Sponsor(
					rs.getInt("sponsor_id"), 
					rs.getString("sponsor_first_name"), 
					rs.getString("sponsor_middle_name"), 
					rs.getString("sponsor_last_name"), 
					rs.getString("sponsor_nationality"), 
					rs.getString("sponsor_gender"), 
					rs.getString("sponsor_contact_no"), 
					rs.getString("sponsor_email"), 
					rs.getString("sponsor_password"), 
					rs.getString("sponsor_govt_id"), 
					rs.getString("sponsorship_id"), 
					rs.getString("sponsorship_description"), 
					rs.getString("sponsor_image"), 
					rs.getString("sponsor_entry_date"));
					sponsor_List.add(sponsor);
				}
		}
		return sponsor_List;
	}
	
	public Sponsor findByEmail(String email) throws Exception{
		String sql = "SELECT * FROM sponsor where sponsor_email=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, email);
			try(ResultSet rs = stmt.executeQuery()) {
				Sponsor sponsor = new Sponsor();
				if(rs.next()) {
					sponsor.setSponsor_id(rs.getInt("sponsor_id"));
					sponsor.setSponsor_first_name(rs.getString("sponsor_first_name"));
					sponsor.setSponsor_middle_name(rs.getString("sponsor_middle_name"));
					sponsor.setSponsor_last_name(rs.getString("sponsor_last_name"));
					sponsor.setSponsor_nationality(rs.getString("sponsor_nationality"));
					sponsor.setSponsor_gender(rs.getString("sponsor_gender"));
					sponsor.setSponsor_contact_no(rs.getString("sponsor_contact_no"));
					sponsor.setSponsor_email(rs.getString("sponsor_email"));
					sponsor.setSponsor_password(rs.getString("sponsor_password"));
					sponsor.setSponsor_govt_id(rs.getString("sponsor_govt_id"));
					sponsor.setSponsorship_id(rs.getString("sponsorship_id"));
					sponsor.setSponsorship_description(rs.getString("sponsorship_description"));
					sponsor.setSponsor_image(rs.getString("sponsor_image"));
					sponsor.setSponsor_entry_date(rs.getString("sponsor_entry_date"));
					return sponsor;
				}
			} 
		}
		return null;
	}

	public int register(Sponsor sponsor) throws Exception{
		int cnt = -1;
		String sql = "insert into sponsor(sponsor_first_name,sponsor_last_name,sponsor_nationality,sponsor_gender,sponsor_contact_no,sponsor_email,sponsor_password) values(?,?,?,?,?,?,?)";
		
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, sponsor.getSponsor_first_name());
			stmt.setString(2, sponsor.getSponsor_last_name());
			stmt.setString(3, sponsor.getSponsor_nationality());
			stmt.setString(4, sponsor.getSponsor_gender());
			stmt.setString(5, sponsor.getSponsor_contact_no());
			stmt.setString(6, sponsor.getSponsor_email());
			stmt.setString(7, sponsor.getSponsor_password());
			
			cnt = stmt.executeUpdate();
		} 
		return cnt;
		}
}
