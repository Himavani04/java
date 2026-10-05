package com.studyopedia;

public class Stud {
	static {
		System.out.println("Vcube");
	}
	{
		System.out.println("Student object created");
	}
	void display() {
		int rollno=8233;
		String name="Himavani";
		int marks=90;
		System.out.println("rollno:"+rollno);
		System.out.println("marks are :"+marks);
	}
	static void display1() {
		int collegeid=15;
		String collegebranch="kphb";
		System.out.println("collegeid:"+collegeid);
		System.out.println("collegebranch:"+collegebranch);
		
	}
public static void main(String[] args) {
		Stud s1=new Stud();
		Stud s2=new Stud();
		s1.display1();
		s2.display();

	}

}
