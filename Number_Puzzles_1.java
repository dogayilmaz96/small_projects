package com.company;

public class Number_Puzzles_1 {
    public static void main(String[] args) {
        for (int k = 1; k <= 9; k++) {
            for (int z = 0; z <= 9; z++) {
                System.out.println((k * 10 + z) + ", " + k + "+" + z + " = " + (z + k));
            }
        }
    }
}