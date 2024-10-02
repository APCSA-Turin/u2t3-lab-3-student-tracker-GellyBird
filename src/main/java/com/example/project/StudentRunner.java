package com.example.project;

public class StudentRunner{
    public static void main(String[] args) {
        //use this StudentRunner class if you need to test your code 
        Student s1 = new Student("meow","meow2",2026);
        s1.addTestScore(100.0);
        s1.addTestScore(90.0);
        s1.addTestScore(83.0);

        s1.printStudentInfo();
    }
}