package com.company;
import java.util.Scanner;
public class MoreNumbersPuzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        while (stop==false) {
            System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
            System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
            System.out.println("3) Quit");
            System.out.print(">");
            int choice = scanner.nextInt();
            System.out.println();
            if (choice == 1) {
                for (int i = 10; i <= 56; i++) {
                    if (((i % 10) + (i / 10)) >= 10) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            } else if (choice == 2) {
                for (int i = 10; i <= 99; i++) {
                    if ((i - ((i % 10) * 10 + (int) (i / 10))) == ((int) (i / 10) + (i % 10))) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            } else if (choice == 3) {
                stop=true;
            }
        }
    }
}
