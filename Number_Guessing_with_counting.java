package com.company;
import java.util.Scanner;
import java.util.Random;
public class Number_Guessing_with_counting {
    public static void main(String[] args) { //SORRRRRR???
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();
        int guess;
        int tries=1;
        int right=random.nextInt(10);
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        guess=scanner.nextInt();
        tries++;
        while(guess != right){
            System.out.println("That is incorrect. Guess again.");
            tries++;
            System.out.print("Your guess: ");
            guess=scanner.nextInt();
        }
        if(tries==right){
            System.out.println("That's right! You're a good guesser.");
        }
        System.out.println("It only took you "+tries+" tries.");
    }
}
