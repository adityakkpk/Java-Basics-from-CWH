package com.company;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int [] marks; // 1D Array
        int [][] flats; //2D Array
        flats = new int [2][3];
        flats[0][0]=100;
        flats[0][1]=101;
        flats[0][2]=102;
        flats[1][0]=203;
        flats[1][1]=204;
        flats[1][2]=205;

        //Displaying 2D array
        for(int i = 0; i<flats.length; i++ ){
            for(int j = 0; j<flats[i].length; j++ ) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
