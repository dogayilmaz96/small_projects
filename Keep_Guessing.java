package com.company;
import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;
public class Keep_Guessing {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int correct_guess=6;
        int guess=0;
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.println();
        System.out.print("YOUR GUESS:");
        guess=keyboard.nextInt();
        while(guess != correct_guess){
            System.out.print("That'is incorrect. Guess again.");
            guess=keyboard.nextInt();
        }
        System.out.println();
        System.out.print("That's right! You're a good guesser.");







    }
}
