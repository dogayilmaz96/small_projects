package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class Nim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 3;
        int b = 3;
        int c = 3;
        System.out.print("Player 1, enter your name: ");
        String name1 = scanner.nextLine();
        System.out.print("Player 2, enter your name: ");
        String name2 = scanner.nextLine();
        System.out.println();
        String winner = "";

        while (true) {
            System.out.print("A: " + a + "\tB: " + b + "\tC: " + c);
            System.out.println();
            System.out.print(name1 + ", choose a pile: ");
            String choice = scanner.next();
            System.out.print("How many to remove from pile " + choice + ": ");
            int n = scanner.nextInt();
            if (choice.equals("A")) {
                a = a - n;
            } else if (choice.equals("B")) {
                b = b - n;
            } else if (choice.equals("C")) {
                c = c - n;
            }
            if(a == 0 && b == 0 && c == 0){
                System.out.println(name1 + " is the winner");
                break;
            }

            System.out.println("A: "+a+"\tB: "+b+"\tC: "+c);
            System.out.print(name2 + ", choose a pile: ");
            String choice2=scanner.next();
            System.out.print("How many to remove from pile " + choice2+ ": ");
            int n2 = scanner.nextInt();
            if (choice2.equals("A")) {
                a = a - n2;
            } else if (choice2.equals("B")) {
                b = b - n2;
            } else if (choice2.equals("C")) {
                c = c - n2;
            }
            System.out.println();

            System.out.println(a + " " + b + " " + c);
            if(a == 0 && b == 0 && c == 0){
                System.out.println(name1 + " is the winner");
                break;
            }

        }
        System.out.print("A: "+a+"\tB: "+b+"\tC: "+c);
        System.out.println();
        System.out.println("All piles are empty. Good job!");
    }
}