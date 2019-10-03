package com.company;
import java.util.Scanner;
public class Right_Triangle_Checker {
    public static void sideCheck(double length){
        Scanner scanner= new Scanner(System.in);
        while(length<0){
            System.out.println("The side cannot be negative!");
            System.out.println("Try again...");
            System.out.println("Side:");
            length=scanner.nextDouble();
        }
        }
        public static void main(String[] args) {
        double side1;
        double side2;
        double side3;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter three digits:");
        System.out.print("Side1: ");
        side1=scanner.nextDouble();
        sideCheck(side1);
        System.out.print("Side2: ");
        side2=scanner.nextDouble();
        sideCheck(side2);
        while(side2<side1){
            System.out.println(side2+" is smaller than "+side1+". Try again.");
        System.out.println("Side2: ");
        side2=scanner.nextDouble();
        sideCheck(side2);
        }
        System.out.print("Side3: ");
        side3=scanner.nextDouble();
        while(side3<side2){
            System.out.println(side3+" is smaller than "+side2+". Try again.");
        System.out.println("Side3: ");
        side3=scanner.nextDouble();
        }
        sideCheck(side3);

        System.out.println("Your three sides are "+side1+","+side2+","+side3+".");

        double square1=Math.pow(side1,2);
        double square2=Math.pow(side2,2);
        double square3=Math.pow(side3,2);

        if(square1+square2==square3) {
            System.out.println("These sides do make a right triangle.Yippy-skippy!");
        }
        else{
            System.out.println("NO! These sides do not make a right triangle!");
        }
        }
    }

