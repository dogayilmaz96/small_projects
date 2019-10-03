package com.company;
import java.util.Scanner;
public class Adding_Values_in_a_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int value=0;
        int sum=0;
        System.out.println("I will add u the numbers you give me.");
        System.out.print("Number: ");
        value=scanner.nextInt();
        sum=value+sum;
        while(value!=0){
            System.out.println("The total so far is "+sum);
            System.out.print("Number: ");
            value=scanner.nextInt();
            sum=value+sum;
        }
        System.out.println();
        System.out.println("The total is "+sum+".");















    }
}
