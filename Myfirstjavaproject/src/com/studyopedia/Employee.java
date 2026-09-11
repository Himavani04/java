package com.studyopedia;

public class Employee {
	int empId;
	String empName;
	double salary;
	static String companyName;

	static{
		companyName="ABC Solutions";
		System.out.println("static block executed");
		
	}
	
	{
		System.out.println("Instance block created");
	}
	public static void main(String args[]) {
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e1.empId=101;
		e1.empName="abc";
		e1.salary=50000;
		
		e2.empId=102;
		e2.empName="lmn";
		e2.salary=60000;
		System.out.println(e1.empId+" "+e1.empName+" "+e1.salary+""+companyName);
		System.out.println(e2.empId+" "+e2.empName+" "+e2.salary+""+companyName);
	}
	

}
