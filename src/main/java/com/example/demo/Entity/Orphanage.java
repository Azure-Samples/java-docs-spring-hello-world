package Entity;

public class Orphanage {

	private int orphanage_id;
	private String orphanage_name, orphanage_location, postcode, orphanage_image_galary, boys, girls, entry_date;
	
	public Orphanage() {
		super();
	}

	public Orphanage(String orphanage_name, String orphanage_location, String postcode, String orphanage_image_galary,
			String boys, String girls, String entry_date) {
		super();
		this.orphanage_name = orphanage_name;
		this.orphanage_location = orphanage_location;
		this.postcode = postcode;
		this.orphanage_image_galary = orphanage_image_galary;
		this.boys = boys;
		this.girls = girls;
		this.entry_date = entry_date;
	}

	public Orphanage(int orphanage_id, String orphanage_name, String orphanage_location, String postcode,
			String orphanage_image_galary, String boys, String girls, String entry_date) {
		super();
		this.orphanage_id = orphanage_id;
		this.orphanage_name = orphanage_name;
		this.orphanage_location = orphanage_location;
		this.postcode = postcode;
		this.orphanage_image_galary = orphanage_image_galary;
		this.boys = boys;
		this.girls = girls;
		this.entry_date = entry_date;
	}

	public int getOrphanage_id() {
		return orphanage_id;
	}

	public void setOrphanage_id(int orphanage_id) {
		this.orphanage_id = orphanage_id;
	}

	public String getOrphanage_name() {
		return orphanage_name;
	}

	public void setOrphanage_name(String orphanage_name) {
		this.orphanage_name = orphanage_name;
	}

	public String getOrphanage_location() {
		return orphanage_location;
	}

	public void setOrphanage_location(String orphanage_location) {
		this.orphanage_location = orphanage_location;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getOrphanage_image_galary() {
		return orphanage_image_galary;
	}

	public void setOrphanage_image_galary(String orphanage_image_galary) {
		this.orphanage_image_galary = orphanage_image_galary;
	}

	public String getBoys() {
		return boys;
	}

	public void setBoys(String boys) {
		this.boys = boys;
	}

	public String getGirls() {
		return girls;
	}

	public void setGirls(String girls) {
		this.girls = girls;
	}

	public String getEntry_date() {
		return entry_date;
	}

	public void setEntry_date(String entry_date) {
		this.entry_date = entry_date;
	}

	@Override
	public String toString() {
		return "Orphanage [orphanage_id=" + orphanage_id + ", orphanage_name=" + orphanage_name
				+ ", orphanage_location=" + orphanage_location + ", postcode=" + postcode + ", orphanage_image_galary="
				+ orphanage_image_galary + ", boys=" + boys + ", girls=" + girls + ", entry_date=" + entry_date + "]";
	}
	
	
	
}
