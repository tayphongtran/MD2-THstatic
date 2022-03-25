package com.company.model;



    public class StudentMethod {
        public static void main(String[] args) {
            Student1.change();
            Student1 student1 = new Student1(111, " Hung");
            Student1 student2 = new Student1(222, "Thuong");
            Student1 student3 = new Student1(333, "Long");

            student1.display();
            student2.display();
            student3.display();
        }
    }


