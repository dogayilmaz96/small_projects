package com.company;
import java.util.Scanner;
public class Pın_Lockout {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    int pin=12345;
    int tries=0;
    System.out.println("WELCOME TO THE BANK OF MITCHELL.");
    System.out.print("ENTER YOUR PIN:");
    int entry=scanner.nextInt();
    tries++;
    while ((entry!=pin) && tries<=3){
        System.out.println();
        System.out.println("INCORRECT PIN. TRY AGAIN.");
        System.out.print("ENTER YOUR PIN:");
        entry=scanner.nextInt();
        tries++;
    }
    if(entry==pin){
        System.out.println("\nPRİNT ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    }
    else if(tries>3){
        System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
    }




















    }

}

