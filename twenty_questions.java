
package com.company;
import java.util.Scanner;
public class twenty_questions {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            String a = "";
            String b = "";
            System.out.println("TWO QUESTİONS!");
            System.out.println("Think of an object, and I'll try to guess it.");
            System.out.println();
            System.out.println("Q1) Is it animal, vegetable, or mineral?");
            a = scanner.nextLine();
            if ((a.equals("animal"))) {
                System.out.println("Q2) Is it bigger than a breadbox?");
                b = scanner.nextLine();
                if (b.equals("no")) {
                    System.out.println("squirrel");
                } else if (b.equals("yes")) {
                    System.out.println("moose");
                } else {
                    System.out.println();
                }
            } else if ((a.equals("vegetable"))) {
                System.out.println("Q2) Is it bigger than a breadbox?");
                b = scanner.nextLine();
                if (b.equals("no")) {
                    System.out.println("carrot");
                } else if (b.equals("yes")) {
                    System.out.println("watermelon");
                } else {
                    System.out.println();
                }
            } else if (a.equals("mineral")) {
                System.out.println("Q2) Is it bigger than a breadbox?");
                b = scanner.nextLine();
                if (b.equals("no")) {
                    System.out.println("paper clip");
                } else if (b.equals("yes")) {
                    System.out.println("Camaro");
                }

            } else {
                System.out.println();
            }

//SOOOORRR

        }
    }
























