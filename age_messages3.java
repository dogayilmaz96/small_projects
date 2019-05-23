package com.company;
import java.util.Scanner;
public class age_messages3 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
    String name="";
    int age=0;
    System.out.print("Your name: ");
    name=keyboard.nextLine();
    System.out.print("Your age: ");
    age=keyboard.nextInt();
    if(age<16){
        System.out.println("You can't drive, "+name+".");
    }
    else if(age>=16 && age<17){
        System.out.println("You can drive but not vote, "+name+".");
    }
    else if(age>=18 && age<24){
        System.out.println("You can vote but not rent a car, "+name+".");
    }
    else if(age>=25){
        System.out.println("You can do anything u want, "+name+".");
    }
    }
}
