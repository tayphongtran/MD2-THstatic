package com.company.model;

public class Student1 {
    private int rollno;
    private  String name;
    private static String college = "Hack";

     Student1(int r , String n) {
         rollno = r;
         name = n;
    }
    static void  change(){
         college = "codegym";
    }
    void  display(){
        System.out.println(rollno + " " + name + " " + college);
    }

}
