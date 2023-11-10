package com.company;

public class Arrays {
    public static void main(String[] args) {
        //Classroom of 500 students
        /*store marks of 500 student
        we have two options:
        1. Create 500 variables
        2. Use Arrays
        */
        //There are three ways to create an array in java
        //   1. Declaration and memory allocation
        //int [ ] marks = new int [5];
        //marks[0] = 100;
        //marks[1] = 90;
        //marks[2] = 80;
        //marks[3] = 70;
        //marks[4] = 60;
        //System.out.println(marks[4]);


        //   2. Declaration and memory allocation
        //int [] marks;
        //marks = new int [5];

        /*  3. Declaration, memory allocation and initialization together
        int [] marks ={100,90,80,70,60};
        System.out.println(marks [4]);
        */



        /*int [] marks ={100,90,80,70,60};
        float [] marks = {100.1f,90.2f,80.3f,70.4f,60.6f};
        String [] student = {"Harry", "Aditya","Abhishek","Ayush","Anshu"};
        System.out.println(student.length);
        System.out.println(student[0]);
        System.out.println(student[3]);
        */

        //Displaying array (naive way)
        //printing using nive way
        int [] marks ={100,90,80,70,60};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //Displaying array ( for loop)
        //Printing using loop
        for(int i = 0; i<marks.length; i++ ){
            System.out.println(marks[i]);
        }
        System.out.println("Printing array in reverse order:");
        for(int i = marks.length -1; i>=0; i-- ){
            System.out.println(marks[i]);
        }

        //printing array using for-each loop
        System.out.println("Printing using for each loop");
        for(int element: marks){
            System.out.println(element);
        }
    }
}
