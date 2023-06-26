package java_project_day1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class App {
	
	public static void main(String args[])
	{
		List<Employee> ls=new ArrayList<Employee>();
		Scanner sc1=new Scanner(System.in);
		EmployeeFactory factory=new EmployeeFactory();
		Employee e;
		while(true)
		{
			System.out.println("1.create a employee");
			System.out.println("2.display all employees");
			System.out.println("0. exit");
			System.out.println("Enter ur choice");
			int ch=sc1.nextInt();
			switch(ch)
			{
			case 1:
				e=factory.createEmployee();
				ls.add(e);
				break;
			case 2:
				for(Employee e1:ls)
					 System.out.println(e1);
			    break;
			case 0:
				System.out.println("Bye");
				System.exit(1);
				break;
			default:
				System.out.println("Enter any valid choice");
				break;
			}
		}
		
	}
	
	
}
