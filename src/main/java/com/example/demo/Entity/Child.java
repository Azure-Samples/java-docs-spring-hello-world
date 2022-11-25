package Entity;

public class Child {
	
	private int child_id ;
	private String child_first_name, child_middle_name, child_last_name, child_DOB, date_admitted, child_mother_name, child_father_name, child_gender, child_nationality, adoption_status;
	private int orphanage_id;
	private String child_image, child_contact_no, child_email, child_govt_id, entry_date;
	
	public Child() {
		super();
	}

	public Child(String child_first_name, String child_middle_name, String child_last_name, String child_DOB,
			String date_admitted, String child_mother_name, String child_father_name, String child_gender,
			String child_nationality, String adoption_status, int orphanage_id, String child_image,
			String child_contact_no, String child_email, String child_govt_id, String entry_date) {
		super();
		this.child_first_name = child_first_name;
		this.child_middle_name = child_middle_name;
		this.child_last_name = child_last_name;
		this.child_DOB = child_DOB;
		this.date_admitted = date_admitted;
		this.child_mother_name = child_mother_name;
		this.child_father_name = child_father_name;
		this.child_gender = child_gender;
		this.child_nationality = child_nationality;
		this.adoption_status = adoption_status;
		this.orphanage_id = orphanage_id;
		this.child_image = child_image;
		this.child_contact_no = child_contact_no;
		this.child_email = child_email;
		this.child_govt_id = child_govt_id;
		this.entry_date = entry_date;
	}

	public Child(int child_id, String child_first_name, String child_middle_name, String child_last_name,
			String child_DOB, String date_admitted, String child_mother_name, String child_father_name,
			String child_gender, String child_nationality, String adoption_status, int orphanage_id, String child_image,
			String child_contact_no, String child_email, String child_govt_id, String entry_date) {
		super();
		this.child_id = child_id;
		this.child_first_name = child_first_name;
		this.child_middle_name = child_middle_name;
		this.child_last_name = child_last_name;
		this.child_DOB = child_DOB;
		this.date_admitted = date_admitted;
		this.child_mother_name = child_mother_name;
		this.child_father_name = child_father_name;
		this.child_gender = child_gender;
		this.child_nationality = child_nationality;
		this.adoption_status = adoption_status;
		this.orphanage_id = orphanage_id;
		this.child_image = child_image;
		this.child_contact_no = child_contact_no;
		this.child_email = child_email;
		this.child_govt_id = child_govt_id;
		this.entry_date = entry_date;
	}

	public int getChild_id() {
		return child_id;
	}

	public void setChild_id(int child_id) {
		this.child_id = child_id;
	}

	public String getChild_first_name() {
		return child_first_name;
	}

	public void setChild_first_name(String child_first_name) {
		this.child_first_name = child_first_name;
	}

	public String getChild_middle_name() {
		return child_middle_name;
	}

	public void setChild_middle_name(String child_middle_name) {
		this.child_middle_name = child_middle_name;
	}

	public String getChild_last_name() {
		return child_last_name;
	}

	public void setChild_last_name(String child_last_name) {
		this.child_last_name = child_last_name;
	}

	public String getChild_DOB() {
		return child_DOB;
	}

	public void setChild_DOB(String child_DOB) {
		this.child_DOB = child_DOB;
	}

	public String getDate_admitted() {
		return date_admitted;
	}

	public void setDate_admitted(String date_admitted) {
		this.date_admitted = date_admitted;
	}

	public String getChild_mother_name() {
		return child_mother_name;
	}

	public void setChild_mother_name(String child_mother_name) {
		this.child_mother_name = child_mother_name;
	}

	public String getChild_father_name() {
		return child_father_name;
	}

	public void setChild_father_name(String child_father_name) {
		this.child_father_name = child_father_name;
	}

	public String getChild_gender() {
		return child_gender;
	}

	public void setChild_gender(String child_gender) {
		this.child_gender = child_gender;
	}

	public String getChild_nationality() {
		return child_nationality;
	}

	public void setChild_nationality(String child_nationality) {
		this.child_nationality = child_nationality;
	}

	public String getAdoption_status() {
		return adoption_status;
	}

	public void setAdoption_status(String adoption_status) {
		this.adoption_status = adoption_status;
	}

	public int getOrphanage_id() {
		return orphanage_id;
	}

	public void setOrphanage_id(int orphanage_id) {
		this.orphanage_id = orphanage_id;
	}

	public String getChild_image() {
		return child_image;
	}

	public void setChild_image(String child_image) {
		this.child_image = child_image;
	}

	public String getChild_contact_no() {
		return child_contact_no;
	}

	public void setChild_contact_no(String child_contact_no) {
		this.child_contact_no = child_contact_no;
	}

	public String getChild_email() {
		return child_email;
	}

	public void setChild_email(String child_email) {
		this.child_email = child_email;
	}

	public String getChild_govt_id() {
		return child_govt_id;
	}

	public void setChild_govt_id(String child_govt_id) {
		this.child_govt_id = child_govt_id;
	}

	public String getEntry_date() {
		return entry_date;
	}

	public void setEntry_date(String entry_date) {
		this.entry_date = entry_date;
	}

	@Override
	public String toString() {
		return "Child [child_id=" + child_id + ", child_first_name=" + child_first_name + ", child_middle_name="
				+ child_middle_name + ", child_last_name=" + child_last_name + ", child_DOB=" + child_DOB
				+ ", date_admitted=" + date_admitted + ", child_mother_name=" + child_mother_name
				+ ", child_father_name=" + child_father_name + ", child_gender=" + child_gender + ", child_nationality="
				+ child_nationality + ", adoption_status=" + adoption_status + ", orphanage_id=" + orphanage_id
				+ ", child_image=" + child_image + ", child_contact_no=" + child_contact_no + ", child_email="
				+ child_email + ", child_govt_id=" + child_govt_id + ", entry_date=" + entry_date + "]";
	}
	
	

}
