package java_project_day1;

import java.util.Scanner;
import java.util.UUID;

public class EmployeeFactory {

	Scanner sc=new Scanner(System.in);
	
	public Employee createEmployee()
	{
		Employee e=new Employee();
		System.out.println("Enter the employee name:");
		String ename=sc.next();
		System.out.println("Enter the employee salary:");
		int esal=sc.nextInt();
		System.out.println("Enter the department name:");
		String dname=sc.next();
		Department d=createDepartment(dname);
		e.setEid(UUID.randomUUID().toString());
		e.setEname(ename);
		e.setEsal(esal);
		e.setDept(d);
		return e;
	}
	private Department createDepartment(String name)
	{
		Department d=new Department();
		System.out.println("Enter the city name:");
		String cname=sc.next();
		System.out.println("Enter the country name:");
		String c=sc.next();
		System.out.println("Enter the zipcode:");
		int z=sc.nextInt();
	    Location l=createLocation(cname,c,z);
	    d.setDid(UUID.randomUUID().toString());
	    d.setDname(name);
	    d.setDloc(l);
	    return d;
	    
	}
	private Location createLocation(String cname,String c,int z)
	{
		Location l=new Location();
		l.setCity(cname);
		l.setCountry(c);
		l.setZipcode(z);
		l.setLocid(UUID.randomUUID().toString());
		return l;
	}
}
