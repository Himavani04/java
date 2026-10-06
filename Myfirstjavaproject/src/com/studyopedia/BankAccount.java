package com.studyopedia;

public class BankAccount {
	static int balance=1000;
	void deposit(int amount) {
		balance+=amount;
		
	}
	void withdrawl(int amount) {
		balance-=amount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b=new BankAccount();
		b.deposit(500);
		b.withdrawl(300);
		System.out.println("Final balance is:"+balance);

	}

}
