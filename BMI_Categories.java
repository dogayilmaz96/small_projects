package com.company;
import java.util.Scanner;
public class BMI_Categories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight=0;
        double height=0;

        System.out.print("your height: ");
        height = scanner.nextDouble();

        System.out.print("your weight: ");
        weight = scanner.nextInt();
        double BMI = weight/(height*height);
        System.out.println();
        System.out.println("Your BMI is "+BMI+".");

        if (BMI<18.5) {
            System.out.println("underweight");
        }
        else if(BMI>=18.5 && BMI<24.9){
            System.out.println("normal weight");
        }
        else if(BMI>=25.0 && BMI<29.9){
            System.out.println("overweigjt");
        }
        else if (BMI>=30.0){
            System.out.println("obese");
        }
    }
}