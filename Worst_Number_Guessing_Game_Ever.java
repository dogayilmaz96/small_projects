package com.company;
import java.util.Scanner;
public class Worst_Number_Guessing_Game_Ever {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
        System.out.println();
        int secret_number=4;
        int wrong_guess;
        System.out.print("I'M THKING OF A NBR FROM 1-10.  TRY 2 GESS!");
        wrong_guess=scanner.nextInt();
        System.out.println();
        if(wrong_guess==secret_number){
            System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS "+secret_number);
        }
        else{
            System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS "+secret_number);
        }


















    }
}
