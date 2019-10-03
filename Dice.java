package com.company;
import sun.awt.windows.ThemeReader;

import java.util.Random;
public class Dice {
    public static void main(String[] args) {
        Random random = new Random();
        int roll_1=1+random.nextInt(6);
        int roll_2=1+random.nextInt(6);
        int total=roll_1+roll_2;
        System.out.println("Here comes the dice!");
        System.out.println("Roll #1: "+roll_1);
        System.out.println("Roll #2: "+roll_2);
        System.out.println("The total is "+total+"!");











    }
}
