package com.company;
import sun.net.www.http.ChunkedOutputStream;

import java.util.Random;
public class Dice_Doubles {
    public static void main(String[] args) {
        System.out.println("HERE COMES THE DİCE!");
        System.out.println();
        Random  random=new Random();
        int roll_1=0;
        int roll_2=0;
        roll_1=1+random.nextInt(6);
        roll_2=1+random.nextInt(6);
        while (roll_1 != roll_2){
            System.out.println("Roll #1: "+roll_1);
            System.out.println("Roll #2: "+roll_2);
            int total=roll_1+roll_2;
            System.out.println("The total is "+total+"!");
            System.out.println();
            roll_1=roll_2;
        }
        System.out.println("Roll #1: "+roll_1);
        System.out.println("Roll #2: "+roll_2);
        int total=roll_1+roll_2;
        System.out.println("The total is "+total+"!");





    }
}
