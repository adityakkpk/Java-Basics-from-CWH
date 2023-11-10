package com.company;

public class MethodOverloading {
    static void foo(){
        System.out.println("Good Morning Aditya! ");
    }
    static void foo(int a){
        System.out.println("Good Morning Aditya " +a+" Bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good Morning Aditya " +a+" Bro!");
        System.out.println("Good Morning Aditya " +b+" Bro!");
    }
    static void change(int a){
        a= 98;

    }
    static void TellJoke(){
        System.out.println("I invented a new word:\n"+ "Plaglariss!");
    }
    static void change2(int [] arr){
        arr[0]=98;
        arr[4]=98;

    }


    public static void main(String[] args) {
        //TellJoke();

        //case 1: Changing the integer
        //int x=45;
        //change(x);
        //System.out.println("The value of x after change:"+ x);
        // case 2: Changing the Array
        //int [] marks = {10,20,30,40,50};
        //change2(marks);
        //System.out.println("The value of marks[ after change:"+ marks[0]+" "+marks[4]);




        //                      Method Overloading
        //Arguments are actual! ,ex: a===3000;
        //Parameter ,ex:  int a; int b;
        // IN method Overloading you can change arguments but not return type.
        foo();
        foo(3);
        foo(300,400);


    }
}
