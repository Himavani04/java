package com.studyopedia;

public class TestDemo5 {
	

	static void method1() {
		method2();
		System.out.println("method1 called !!");
	}


	void method3() {
		method4();
		System.out.println("method3 called !!");
	}

	
	void method4() {
		System.out.println("method4 called !! ");
		method5();
	}

	static void method5() {
		System.out.println("method5 called !! ");
	}


	static void method2() {
		TestDemo5 t = new TestDemo5();
		t.method3();
		System.out.println("method2 called !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestDemo5.method1();
		System.out.println("main method ended ");
	}
}
