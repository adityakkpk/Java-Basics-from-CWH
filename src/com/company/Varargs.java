package com.company;

public class Varargs {
    //static int sum(int a,int b){
    //    return a+b;
    //}
    //static int sum(int a,int b,int c){
    //    return a+b+c;
    //}
    //static int sum(int a,int b,int c,int d){
    //    return a+b+c+d;
    //}
    static int sum(int x,int ...arr){
        //Available as int [] arr;
        int result=x;
        for(int a: arr){
            result +=a;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs tutorial");
        //System.out.println("Sum of nothing:"+ sum());
        System.out.println("Sum of 1 is"+ sum(1));
        System.out.println("The sum of 4 and 5 is :"+ sum(4,5));
        System.out.println("The sum of 4 , 3 and 5 is :"+ sum(4,3,5));
        System.out.println("The sum of 4 , 3 ,4 and 5 is :"+ sum(4,3,4,5));
    }
}
