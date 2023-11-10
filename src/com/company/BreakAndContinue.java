package com.company;

public class BreakAndContinue {
    public static void main(String[] args) {
        //Break and continue using loops!
//        for(int i=1;i<5;i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop.");
//                break;
//            }
//        }
//        int i=1;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Endind the loop");
//                break;
//            }
//            i++;
//        }
//        System.out.println("loop Ends here");


        for(int i = 1; i<5; i++) {

            if(i==2) {
                System.out.println("Ending the loop");
                continue;
            }
                System.out.println(i);
                System.out.println("Java is great");

        }






    }
}
