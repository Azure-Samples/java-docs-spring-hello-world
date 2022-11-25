package Entity;

public class Admin {
	
	private int admin_id;
	private String admin_first_name, admin_middle_name, admin_last_name, nationality, gender, admin_contact_no, admin_email, admin_password, admin_govt_id, admin_occupation;
	private int volunteer_id;
	private String entry_date;
	
	public Admin() {
		super();
	}

	public Admin(String admin_first_name, String admin_middle_name, String admin_last_name, String nationality,
			String gender, String admin_contact_no, String admin_email, String admin_password, String admin_govt_id,
			String admin_occupation, int volunteer_id, String entry_date) {
		super();
		this.admin_first_name = admin_first_name;
		this.admin_middle_name = admin_middle_name;
		this.admin_last_name = admin_last_name;
		this.nationality = nationality;
		this.gender = gender;
		this.admin_contact_no = admin_contact_no;
		this.admin_email = admin_email;
		this.admin_password = admin_password;
		this.admin_govt_id = admin_govt_id;
		this.admin_occupation = admin_occupation;
		this.volunteer_id = volunteer_id;
		this.entry_date = entry_date;
	}

	public Admin(int admin_id, String admin_first_name, String admin_middle_name, String admin_last_name,
			String nationality, String gender, String admin_contact_no, String admin_email, String admin_password,
			String admin_govt_id, String admin_occupation, int volunteer_id, String entry_date) {
		super();
		this.admin_id = admin_id;
		this.admin_first_name = admin_first_name;
		this.admin_middle_name = admin_middle_name;
		this.admin_last_name = admin_last_name;
		this.nationality = nationality;
		this.gender = gender;
		this.admin_contact_no = admin_contact_no;
		this.admin_email = admin_email;
		this.admin_password = admin_password;
		this.admin_govt_id = admin_govt_id;
		this.admin_occupation = admin_occupation;
		this.volunteer_id = volunteer_id;
		this.entry_date = entry_date;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_first_name() {
		return admin_first_name;
	}

	public void setAdmin_first_name(String admin_first_name) {
		this.admin_first_name = admin_first_name;
	}

	public String getAdmin_middle_name() {
		return admin_middle_name;
	}

	public void setAdmin_middle_name(String admin_middle_name) {
		this.admin_middle_name = admin_middle_name;
	}

	public String getAdmin_last_name() {
		return admin_last_name;
	}

	public void setAdmin_last_name(String admin_last_name) {
		this.admin_last_name = admin_last_name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAdmin_contact_no() {
		return admin_contact_no;
	}

	public void setAdmin_contact_no(String admin_contact_no) {
		this.admin_contact_no = admin_contact_no;
	}

	public String getAdmin_email() {
		return admin_email;
	}

	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public String getAdmin_govt_id() {
		return admin_govt_id;
	}

	public void setAdmin_govt_id(String admin_govt_id) {
		this.admin_govt_id = admin_govt_id;
	}

	public String getAdmin_occupation() {
		return admin_occupation;
	}

	public void setAdmin_occupation(String admin_occupation) {
		this.admin_occupation = admin_occupation;
	}

	public int getVolunteer_id() {
		return volunteer_id;
	}

	public void setVolunteer_id(int volunteer_id) {
		this.volunteer_id = volunteer_id;
	}

	public String getEntry_date() {
		return entry_date;
	}

	public void setEntry_date(String entry_date) {
		this.entry_date = entry_date;
	}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_first_name=" + admin_first_name + ", admin_middle_name="
				+ admin_middle_name + ", admin_last_name=" + admin_last_name + ", nationality=" + nationality
				+ ", gender=" + gender + ", admin_contact_no=" + admin_contact_no + ", admin_email=" + admin_email
				+ ", admin_password=" + admin_password + ", admin_govt_id=" + admin_govt_id + ", admin_occupation="
				+ admin_occupation + ", volunteer_id=" + volunteer_id + ", entry_date=" + entry_date + "]";
	}

	
	
}
