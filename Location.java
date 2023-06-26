package java_project_day1;

public class Location {
	//private instance variables
	private String locid;
	private String city;
	private int zipcode;
	private String country;
	public String getLocid() {
		return locid;
	}
	public void setLocid(String locid) {
		this.locid = locid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Location [locid=" + locid + ", city=" + city + ", zipcode=" + zipcode + ", country=" + country + "]";
	}
	
	

}
