package java_project_day1;

public class Employee {
	//private instance variables
	private String ename;
	private int esal;
	private String eid;
	private Department dept;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", esal=" + esal + ", eid=" + eid + ", dept=" + dept + "]";
	}
	

}
