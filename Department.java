package java_project_day1;

public class Department {
	
	
	private String dname;
	private Location dloc;
	private String did;
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Location getDloc() {
		return dloc;
	}
	public void setDloc(Location dloc) {
		this.dloc = dloc;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	@Override
	public String toString() {
		return "Department [dname=" + dname + ", dloc=" + dloc + ", did=" + did + "]";
	}
	
	
	
	

}
