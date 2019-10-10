package com.company;
import java.util.Scanner;
public class Area_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shape Area Calculator version 0.1 (c) 2005 Mitchell Sample Output, Inc.");
        while (true) {
            System.out.println();
            System.out.println("1)Triangle");
            System.out.println("2)Rectangle");
            System.out.println("3)Square");
            System.out.println("4)Circle");
            System.out.println("5)Quit");
            System.out.print("Which shape: ");
            int choice = scanner.nextInt();
            System.out.println();
            if (choice == 1) {
                System.out.print("Base: ");
                int base = scanner.nextInt();
                System.out.print("Height: ");
                int height = scanner.nextInt();
                area_Triangle(base, height);
            }
            else if (choice == 2) {
                System.out.print("Length: ");
                int length = scanner.nextInt();
                System.out.print("Width: ");
                int width = scanner.nextInt();
                area_Rectangle(length, width);
            }   else if (choice == 3) {
                System.out.println("Side: ");
                int side = scanner.nextInt();
                area_Square(side);
            }   else if (choice == 4) {
                System.out.print("Radius: ");
                int radius = scanner.nextInt();
                area_Circle(radius);
            }
            else if (choice == 5) {
                Quit();
                break;
            }
        }}
    public static int area_Triangle(int base,int height){
        int area;
        area=((base*height)*(1/2));
        System.out.println("The area is "+area);
        return area;
    }
    public static int area_Rectangle(int length,int width){
        int area=0;
        area=length*width;
        System.out.println("The area is "+area);
        return area;
    }
    public static int area_Square(int side){
        int area=0;
        area=side*side;
        System.out.println("The area is "+area);
        return area;
    }
    public static double area_Circle(int radius){
        double area=0;
        area=((Math.PI)*radius*radius);
        System.out.println("The area is "+area);
        return area;
    }
    public static String Quit(){
        System.out.println("Goodbye");
        return null;
    }
}
