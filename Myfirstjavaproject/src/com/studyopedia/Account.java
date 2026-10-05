package com.studyopedia;

class Account{
    int Accno;
    String name;
    double salary;

    static int accountNoGenerater = 100;

   
    {
        accountNoGenerater++;
        Accno = accountNoGenerater;
    }

    Account(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Account No: " + Accno);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        Account a1 = new Account("Rahul", 25000);
        Account a2 = new Account("Priya", 30000);
        Account a3 = new Account("Amit", 40000);

        a1.display();
        a2.display();
        a3.display();
    }
}
	
