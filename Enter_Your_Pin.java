package com.company;
import java.util.Scanner;
public class Enter_Your_Pin {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int pin=12345;
        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOUR PIN: ");
        int entry =scanner.nextInt();
        while (entry !=pin) {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.println("ENTER YOUR PIN: ");
            entry = scanner.nextInt();
        }
        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");





    }



















}
