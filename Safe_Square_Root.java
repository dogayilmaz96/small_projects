package com.company;
import java.util.Scanner;
public class Safe_Square_Root {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       System.out.println("SAFE SQUARE ROOT!");
       System.out.print("Enter a number: ");
       int root=scanner.nextInt();
       while (root>0){
           System.out.println("The sqaure root of "+root+" is "+Math.sqrt(root));
           System.out.print("Enter a number: ");
           root=scanner.nextInt();
       }
       System.out.println("You can't take the square root of a negative number, silly.");
       System.out.print("Try again: ");
       root=scanner.nextInt();
       while(root>0){
           System.out.println("The sqaure root of "+root+" is "+Math.sqrt(root));
           System.out.print("Enter a number: ");
           root=scanner.nextInt();
           System.out.println("The sqaure root of "+root+" is "+Math.sqrt(root));
       }
    }
}
