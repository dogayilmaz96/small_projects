package com.company;
import java.util.Scanner;
public class Counting_with_a_While_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a message, and I'll display it five times.");
        String message = scanner.nextLine();
        int  n=0;
        while (n<5){
            System.out.println((n+1) + "." +message);
            n++;
        }
    }
}
