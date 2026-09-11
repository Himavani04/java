package com.studyopedia;

public class Student {
	static String collegeName="Vcube";
	String studentName;
	int studentId;
	int studentMarks;

	public static void main(String[] args) {
		Student s1=new Student();
		s1.studentName="abc";
		s1.studentId=101;
		s1.studentMarks=90;
		System.out.println("college name:"+collegeName);
		System.out.println(" StudentName:"+s1.studentName);
		System.out.println("STUDENTID:"+s1.studentId);
		System.out.println("studentMarks:"+s1.studentMarks);
	}

}
