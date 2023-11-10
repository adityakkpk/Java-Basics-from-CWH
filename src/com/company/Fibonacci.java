// package com.company;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter how long you want the Fibonacci Series:");
        int n = a.nextInt();
        int First = 0;
        int Second = 1;
        int sum;
        System.out.print("\nPrinting fibonacci Series: ");
        System.out.printf("%d %d ",First,Second);
        for(int i = 1; i<=n;i++){
            sum= First + Second;
            System.out.printf("%d ",sum);
            First=Second;
            Second=sum;


        }
    }

}
