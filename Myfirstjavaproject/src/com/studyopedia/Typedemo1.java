
package com.studyopedia;

public class Typedemo1 {

    static String collegename = "vcube";

    String StudentName;
    int rollno;
    String course;

    int subj1marks;
    int subj2marks;
    int subj3marks;

    int Totalmarks;
    int avgmarks;

    void StudentDetails() {
        System.out.println("Studentname is: " + StudentName);
        System.out.println("RollNo is: " + rollno);
        System.out.println("Course is: " + course);
    }

    void calculateTotal() {
        Totalmarks = subj1marks + subj2marks + subj3marks;
        System.out.println("TotalMarks are: " + Totalmarks);
    }

    void avg() {
        avgmarks = Totalmarks / 3;
        System.out.println("Average marks are:" + avgmarks);
    }

    public static void main(String args[]) {

        Typedemo1 t = new Typedemo1();

        t.StudentName = "Raha";
        t.rollno =1213;
        t.course ="jfs";

        t.subj1marks =90;
        t.subj2marks =95;
        t.subj3marks =100;

        t.StudentDetails();
        t.calculateTotal();
        t.avg();
    }
}

