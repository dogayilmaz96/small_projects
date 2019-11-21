package com.company;

public class Number_Puzzle_3 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if ((Math.pow((i % 10), 3)) + (Math.pow(((i / 10) % 10), 3)) + (Math.pow(((i / 100) % 10), 3)) == i) {
                System.out.print(i + " ");
            }
        }

    }
}