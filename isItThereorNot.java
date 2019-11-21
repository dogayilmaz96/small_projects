package com.company;
import java.util.Random;
import java.util.Scanner;
public class isItThereorNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[10];
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + random.nextInt(50);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        System.out.print("Values to find:");
        System.out.println();
        int value = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                found = true;
            }
        }
        if (found)
        System.out.println(value + " is in the array.");
        else{
            System.out.println(value+" is not in the array.");
        }
    }

}

