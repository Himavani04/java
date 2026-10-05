package com.studyopedia;

public class Typecast {
	
	int i=125;
	double i2=i;
	double d=453.55d;
	int d2=(int)d;
	char c='a';
	int i3=(int)c;
	int i4=567;
	char c2=(char)i4;
	
	
	
	
	public static void main(String args[]) {
		Typecast t=new Typecast();
		
		System.out.println(t.i);
		System.out.println(t.i2);
		System.out.println(t.d);
		System.out.println(t.d2);
		System.out.println(t.c);
		System.out.println(t.i3);
		System.out.println(t.i4);
		System.out.println(t.c2);
		
		
	}
	
	

}
