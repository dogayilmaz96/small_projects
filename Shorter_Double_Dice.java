package com.company;
import java.util.Random;
public class Shorter_Double_Dice {
    public static void main(String[] args) {
        Random random = new Random();
        int Roll1 = 1 + random.nextInt(6);
        int Roll2 = 1 + random.nextInt(6);
        int total = Roll1 + Roll2;
        System.out.println("HERE COMES THE DICE");
        System.out.println("Roll#1: " + Roll1);
        System.out.println("Roll#2: " + Roll2);
        System.out.println("The total is " + total + "!");
        while (Roll1 != Roll2){
            Roll1 = 1 + random.nextInt(6);
            Roll2 = 1 + random.nextInt(6);
            total = Roll1 + Roll2;
            System.out.println("Roll#1: " + Roll1);
            System.out.println("Roll#2: " + Roll2);
            System.out.println("The total is " + total + "!");
        }




    }
}
