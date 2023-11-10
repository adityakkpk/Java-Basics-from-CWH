package com.company;

public class Recursion {
    //Factorial(n)=n*n-1*....1
    //Factorial(5)=5*4*4*2*1;
    //factorial(0)=1;
    //factorial(n)=n*factorial(n-1);
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static int factorial_itertive(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            int product = 1;
            for(int i=1;i<=n;i++){
                product *=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {

        int x=6;
        System.out.printf("Factorial of %d is:%d\n",x, factorial(x));
        System.out.printf("Factorial of %d is:%d",x, factorial_itertive(x));
    }
}
