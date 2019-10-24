package com.company;

import java.util.Scanner;

public class Do_While_Swimming {
    public static void main(String[] args) throws Exception {//SORRRRRRRRRRRRRRR
        Scanner scanner = new Scanner(System.in);

        double current_temp;
        double min_temp = 79.0;
        double saved_temp;
        int swimtime;

        String swimmer1 = "GALLANT";
        String swimmer2 = "GOOFUS";

        System.out.println("What is the current water temperature? ");
        current_temp = scanner.nextDouble();
        saved_temp = current_temp;
        System.out.println();
        System.out.println("Okay, so the current water temperature is " + current_temp + "F.");
        System.out.println(swimmer1 + " approaches the lake....");
        int time = 0;
        while (current_temp >= min_temp) {

            System.out.print(swimmer1 + " swims for a bit.");
            time++;
            System.out.println("Swim time: " + time + " min.");
            Thread.sleep(600);
            current_temp -= 0.5;
            System.out.println("The current water temperature is now " + current_temp + "F.");
        }
        System.out.print(swimmer1 + " stops swimming. Total swim time: " + time + "min.");
        System.out.println();
        current_temp = saved_temp;
        System.out.println("okay, so the current water temperature is " + current_temp + "F.");
        System.out.println(swimmer2 + " approaches the lake...");
        time = 0;
        do {

            System.out.print(swimmer2 + " swims for a bit.");
            time++;
            System.out.println("Swim time: " + time + "min.");
            Thread.sleep(600);
            current_temp -= 0.5;
            System.out.println();
            System.out.println("The current water temperature is now " + current_temp + "F.");
        }
        while (current_temp >= min_temp);
        System.out.println(swimmer2 + " stops swimming. Total swim time: " + time + "min.");


    }
}
