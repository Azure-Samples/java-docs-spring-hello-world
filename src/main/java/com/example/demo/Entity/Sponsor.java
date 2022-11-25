package Entity;

import java.io.Serializable;

public class Sponsor implements Serializable {
	private int Sponsor_id;
    
	private String sponsor_first_name, sponsor_middle_name, sponsor_last_name, sponsor_nationality, sponsor_gender, sponsor_contact_no, sponsor_email, sponsor_password, sponsor_govt_id, sponsorship_id, sponsorship_description, sponsor_image, sponsor_entry_date;

	public Sponsor() {
		super();
	}
	
	

	public Sponsor(String sponsor_first_name, String sponsor_last_name, String sponsor_nationality,
			String sponsor_gender, String sponsor_contact_no, String sponsor_email, String sponsor_password,
			String sponsor_govt_id) {
		super();
		this.sponsor_first_name = sponsor_first_name;
		this.sponsor_last_name = sponsor_last_name;
		this.sponsor_nationality = sponsor_nationality;
		this.sponsor_gender = sponsor_gender;
		this.sponsor_contact_no = sponsor_contact_no;
		this.sponsor_email = sponsor_email;
		this.sponsor_password = sponsor_password;
		this.sponsor_govt_id = sponsor_govt_id;
	}



	public Sponsor(String sponsor_first_name, String sponsor_middle_name, String sponsor_last_name,
			String sponsor_nationality, String sponsor_gender, String sponsor_contact_no, String sponsor_email,
			String sponsor_password, String sponsor_govt_id, String sponsorship_id, String sponsorship_description,
			String sponsor_image, String sponsor_entry_date) {
		super();
		this.sponsor_first_name = sponsor_first_name;
		this.sponsor_middle_name = sponsor_middle_name;
		this.sponsor_last_name = sponsor_last_name;
		this.sponsor_nationality = sponsor_nationality;
		this.sponsor_gender = sponsor_gender;
		this.sponsor_contact_no = sponsor_contact_no;
		this.sponsor_email = sponsor_email;
		this.sponsor_password = sponsor_password;
		this.sponsor_govt_id = sponsor_govt_id;
		this.sponsorship_id = sponsorship_id;
		this.sponsorship_description = sponsorship_description;
		this.sponsor_image = sponsor_image;
		this.sponsor_entry_date = sponsor_entry_date;
	}

	public Sponsor(int sponsor_id, String sponsor_first_name, String sponsor_middle_name, String sponsor_last_name,
			String sponsor_nationality, String sponsor_gender, String sponsor_contact_no, String sponsor_email,
			String sponsor_password, String sponsor_govt_id, String sponsorship_id, String sponsorship_description,
			String sponsor_image, String sponsor_entry_date) {
		super();
		Sponsor_id = sponsor_id;
		this.sponsor_first_name = sponsor_first_name;
		this.sponsor_middle_name = sponsor_middle_name;
		this.sponsor_last_name = sponsor_last_name;
		this.sponsor_nationality = sponsor_nationality;
		this.sponsor_gender = sponsor_gender;
		this.sponsor_contact_no = sponsor_contact_no;
		this.sponsor_email = sponsor_email;
		this.sponsor_password = sponsor_password;
		this.sponsor_govt_id = sponsor_govt_id;
		this.sponsorship_id = sponsorship_id;
		this.sponsorship_description = sponsorship_description;
		this.sponsor_image = sponsor_image;
		this.sponsor_entry_date = sponsor_entry_date;
	}

	public int getSponsor_id() {
		return Sponsor_id;
	}

	public void setSponsor_id(int sponsor_id) {
		Sponsor_id = sponsor_id;
	}

	public String getSponsor_first_name() {
		return sponsor_first_name;
	}

	public void setSponsor_first_name(String sponsor_first_name) {
		this.sponsor_first_name = sponsor_first_name;
	}

	public String getSponsor_middle_name() {
		return sponsor_middle_name;
	}

	public void setSponsor_middle_name(String sponsor_middle_name) {
		this.sponsor_middle_name = sponsor_middle_name;
	}

	public String getSponsor_last_name() {
		return sponsor_last_name;
	}

	public void setSponsor_last_name(String sponsor_last_name) {
		this.sponsor_last_name = sponsor_last_name;
	}

	public String getSponsor_nationality() {
		return sponsor_nationality;
	}

	public void setSponsor_nationality(String sponsor_nationality) {
		this.sponsor_nationality = sponsor_nationality;
	}

	public String getSponsor_gender() {
		return sponsor_gender;
	}

	public void setSponsor_gender(String sponsor_gender) {
		this.sponsor_gender = sponsor_gender;
	}

	public String getSponsor_contact_no() {
		return sponsor_contact_no;
	}

	public void setSponsor_contact_no(String sponsor_contact_no) {
		this.sponsor_contact_no = sponsor_contact_no;
	}

	public String getSponsor_email() {
		return sponsor_email;
	}

	public void setSponsor_email(String sponsor_email) {
		this.sponsor_email = sponsor_email;
	}

	public String getSponsor_password() {
		return sponsor_password;
	}

	public void setSponsor_password(String sponsor_password) {
		this.sponsor_password = sponsor_password;
	}

	public String getSponsor_govt_id() {
		return sponsor_govt_id;
	}

	public void setSponsor_govt_id(String sponsor_govt_id) {
		this.sponsor_govt_id = sponsor_govt_id;
	}

	public String getSponsorship_id() {
		return sponsorship_id;
	}

	public void setSponsorship_id(String sponsorship_id) {
		this.sponsorship_id = sponsorship_id;
	}

	public String getSponsorship_description() {
		return sponsorship_description;
	}

	public void setSponsorship_description(String sponsorship_description) {
		this.sponsorship_description = sponsorship_description;
	}

	public String getSponsor_image() {
		return sponsor_image;
	}

	public void setSponsor_image(String sponsor_image) {
		this.sponsor_image = sponsor_image;
	}

	public String getSponsor_entry_date() {
		return sponsor_entry_date;
	}

	public void setSponsor_entry_date(String sponsor_entry_date) {
		this.sponsor_entry_date = sponsor_entry_date;
	}

	@Override
	public String toString() {
		return "Sponsor [Sponsor_id=" + Sponsor_id + ", sponsor_first_name=" + sponsor_first_name
				+ ", sponsor_middle_name=" + sponsor_middle_name + ", sponsor_last_name=" + sponsor_last_name
				+ ", sponsor_nationality=" + sponsor_nationality + ", sponsor_gender=" + sponsor_gender
				+ ", sponsor_contact_no=" + sponsor_contact_no + ", sponsor_email=" + sponsor_email
				+ ", sponsor_password=" + sponsor_password + ", sponsor_govt_id=" + sponsor_govt_id
				+ ", sponsorship_id=" + sponsorship_id + ", sponsorship_description=" + sponsorship_description
				+ ", sponsor_image=" + sponsor_image + ", sponsor_entry_date=" + sponsor_entry_date + "]";
	}
	
	
    
}
