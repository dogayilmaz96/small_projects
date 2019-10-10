package com.company;
import java.util.Scanner;
import java.util.Random;
public class Flip_Again {
    public static void main(String[] args) {//SORRRRRRRRRRRRRRR
        Scanner scanner= new Scanner(System.in);
        Random random = new Random();
        String again="yes";
        int flip=0;
        String coin="";

       while (again.equals("yes")){
           flip=1+random.nextInt(2);
           if(flip==1){
               coin="TAILS";
           }
           else {
               coin="HEADS";
           }
           System.out.println("You flip a coin and it is... "+coin);
           System.out.println("Would you like to flip it again? (y/n)");
           again=scanner.next();
       }




    }
}
