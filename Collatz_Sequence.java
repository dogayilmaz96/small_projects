package com.company;
import java.util.Scanner;
public class Collatz_Sequence {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Starting number: ");
        int number=scanner.nextInt();
        System.out.print(number+"  ");
        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = (number * 3) + 1;
            }
       System.out.print(number+"  ");
        }
    System.out.println("It works!");
    }
}
