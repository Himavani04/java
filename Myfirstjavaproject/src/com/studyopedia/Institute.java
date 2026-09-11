package com.studyopedia;

public class Institute {
	static String TrainerName1="srikanth";
	static String TrainerName2="Vishwa";
	String EmployeeName;
	int EmployeeId;
	String EmployeeDesignation;


	public static void main(String[] args) {
		Institute i1=new Institute();
		Institute i2=new Institute();
		i1.EmployeeName="abc";
		i2.EmployeeName="pqr";
		i1.EmployeeId=101;
		i2.EmployeeId=102;
		i1.EmployeeDesignation="software engineer";
		i2.EmployeeDesignation="Tester";
		System.out.println("Name of employee:"+i1.EmployeeName);
		System.out.println("Name of employee:"+i2.EmployeeName);
		System.out.println("employeeid:"+i1.EmployeeId);
		System.out.println("employeeid:"+i2.EmployeeId);
		System.out.println("Designation:"+i1.EmployeeDesignation);
		System.out.println("Designation:"+i2.EmployeeDesignation);
		
		System.out.println("Trainer1name:"+TrainerName1);;
		System.out.println("Trainer2name:"+TrainerName2);
		
	}

}
