package com.company;
import java.util.Random;
import java.util.Scanner;
public class One_Shot_hi_lo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner= new Scanner(System.in);
        int right=1+random.nextInt(100);
        int guess;
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        guess=scanner.nextInt();
        if(guess==right){
            System.out.println("You guessed it!  What are the odds?!?");
        }
        else if(guess>right){
            System.out.println("Sorry, you are too high.  I was thinking of "+right+".");
        }
        else if(guess<right){
            System.out.println("Sorry, you are too low.  I was thinking of "+right+".");
        }















    }
}
