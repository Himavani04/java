package com.studyopedia;

public class TestDemo {

	protected void finalize()  {
		System.out.println("starting finalize object");
	
	}
	void display() {
		TestDemo t=new TestDemo();
		System.out.println("displayed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo t1=new TestDemo();
		t1=null;
	
		TestDemo t2=new TestDemo();
		TestDemo t3=new TestDemo();
		TestDemo t4=new TestDemo();
		t2=t3;
		new TestDemo();
		
		System.gc();
		t4.display();
		System.gc();
	}

}
