package com.company;
import java.util.Random;
import java.util.Scanner;
public class A_Number_Guessing_Game {
    public static void main(String[] args) {
        Random random= new Random();
        Scanner scanner= new Scanner(System.in);
        int right=1+random.nextInt(10);
        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.print("Your guess:");
        int guess=scanner.nextInt();
        if(right==guess){
            System.out.println("That's right!");
        }
        else if(right != guess);
        System.out.println("Sorry,but ı was really thinking of "+right+".");









    }
}
