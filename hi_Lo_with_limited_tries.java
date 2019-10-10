package com.company;
import java.util.Random;
import java.util.Scanner;
public class hi_Lo_with_limited_tries {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner((System.in));
        int pick=1+random.nextInt(100);
        int tries=1;
        int guess=0;
        System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
        while(guess!=pick&&tries<=7){
            System.out.println("Guess #"+tries+": ");
            guess=scanner.nextInt();
            if(guess<pick&&tries<=7){
                System.out.println("Sorry, you are too low.");
            }
            else if(guess>pick&&tries<=7){
                System.out.println("Sorry, you are too high.");
            }
            else if(pick==guess){
                System.out.println("You guessed it! What are the odds?!?!");
            }
            tries++;
        }
    if(tries>7&&guess!=pick){
        System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
    }






    }
}
