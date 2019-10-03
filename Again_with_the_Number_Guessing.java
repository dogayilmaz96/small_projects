package com.company;
import java.util.Random;
import java.util.Scanner;
public class Again_with_the_Number_Guessing {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int chosen=1+random.nextInt(10);
        int guess;
        int tries=0;
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        guess=scanner.nextInt();
        tries++;
        while(guess != chosen){
            System.out.println("That is incorrect. Guess again.");
            System.out.print("Your guess: ");
            guess=scanner.nextInt();
       tries++;
        }
        System.out.println("That's right! You're a good guesser.");
        System.out.println("It only took you "+tries+" tries.");







    }
}
