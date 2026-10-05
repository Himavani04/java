package com.studyopedia;

public class Demooperator {
	
	void add() {
		int a=25;
		int b=30;
		System.out.println("addition is:"+(a+b));		
	}
	void sub() {
		int x=45;
		int y=15;
		System.out.println("addition is:"+(x-y));	
		
	}
	void mul() {
		int p=35;
		int q=2;
		System.out.println("Multiplication is:"+(p*q));
	}
	void div() {
		int s=50;
		int t=15;
		System.out.println("Division is:"+(s%t));
	}

	public static void main(String[] args) {
		Demooperator d=new Demooperator();
		d.add();
		d.sub();
		d.mul();
		d.div();
		
		

	}

}
