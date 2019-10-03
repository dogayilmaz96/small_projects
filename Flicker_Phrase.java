package com.company;
import java.util.Random;
public class Flicker_Phrase {
    public static void main(String[] args) {
        Random random= new Random();
        for (int i=0; i<6; i++) {
            int num = 1 + random.nextInt(5);
            if (num == 1) {
                first();
            } else if (num == 2) {
                second();
            } else if (num == 3) {
                third();
            } else if (num == 4) {
                forth();
            } else if (num == 5) {
                fifth();
            }

        }
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I pledge allegiance to the flag.");

    }
    public static void first(){
        System.out.print("I ");
    }
    public static void second(){
        System.out.print(" pledge");
    }
    public static void third(){
        System.out.print(" allegiance");
    }
    public static void forth(){
        System.out.print(" to the");
    }
    public static void fifth(){
        System.out.print(" flag.");
    }
}

