package com.company;

public class Multiplication_Table {
    public static void main(String[] args) {
        System.out.print("x | ");
        for(int i=1; i<=9; i++) {
            System.out.print( i + "       ");
        }
        System.out.println();
        System.out.println("==+==================================================================");
        for (int j = 1; j<= 12; j++) {
            System.out.print(j+" | ");

            for(int i=1; i<=9; i++){
                System.out.print( j * i+"       ");
            }
            System.out.println();


        }
    }
}
