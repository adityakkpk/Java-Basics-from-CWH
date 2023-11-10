package com.company;

import java.util.Scanner;

public class Practice1 {
    public static void main(StringInJava[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks of Subject1:");
        float sub1=scan.nextFloat();
        System.out.println("Enter the marks of Subject2:");
        float sub2=scan.nextFloat();
        System.out.println("Enter the marks of Subject3:");
        float sub3=scan.nextFloat();
        System.out.println("Enter the marks of Subject4:");
        float sub4=scan.nextFloat();
        System.out.println("Enter the marks of Subject5:");
        float sub5=scan.nextFloat();

        float Percentage = ((sub1+sub2+sub3+sub4+sub5)/5);

        System.out.println("Percentage:");
        System.out.println(Percentage);

    }
}
