package com.company;
import java.util.Scanner;
public class Chapter7PracticeSet {
    static void multiplication(int n){
        for (int i =1;i<=10;i++) {
            System.out.printf("%d X %d = %d\n", n, i,n*i);
        }
    }
    static void pattern1(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    static void pattern2(int n){
        for (int i=n;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern_rec(int n){
        if(n>0){
            pattern_rec(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        //Problem1
        //System.out.println("Which number's table you want:");
        //int x=s.nextInt();
        //multiplication(x);

        //Problem2
        //System.out.println("Enter the number or rows:");
        //int y=s.nextInt();
        //pattern1(y);

        //Problem3
        //int c=sumRec(3);
        //System.out.println(c);


        //Problem4
        //System.out.println("Enter the number or rows:");
        //int z=s.nextInt();
        //pattern2(z);


        //Problem8
        System.out.println("Enter the number or rows:");
        int a=s.nextInt();
        pattern_rec(a);


    }
}
