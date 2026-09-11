package com.studyopedia;

public class Second {

	static int count=0;
	{
		count++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second s1=new Second();
		Second s2=new Second();
		System.out.println(count);

	}

}
