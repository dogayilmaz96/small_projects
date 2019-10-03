package com.company;
import java.util.Scanner;
public class Boolean {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        System.out.println("What is your first name?");
        String name=console.next();
        if(name.startsWith("Dr.")){
            System.out.println("I am a Doctor.");
        }
        else if(name.endsWith("s")){
            System.out.println("And I am a plural word");
        }
    }
}
