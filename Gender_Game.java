package com.company;
import java.util.Scanner;
public class Gender_Game {
    public static void main(String[] args) {
        String gender="";
        String firstname="";
        String lastname="";
        String mors="";
        int age=0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What's your gender?");
        gender = keyboard.nextLine();

        System.out.print("First name: ");
        firstname=keyboard.nextLine();

        System.out.print("Last name: ");
        lastname=keyboard.nextLine();

        System.out.print("Age: ");
        age=keyboard.nextInt();

        if(age>20){
            System.out.println("Are you married or single?");
        mors=keyboard.next();

         if(gender.equals("female")){
             if(mors.equals("married")) {
                 System.out.println("Mrs." + firstname + " " + lastname + "" + ", hello!");
             }
             else if(mors.equals("single")){
                 System.out.println("Ms."+firstname+" "+lastname+", hello!");
             }
         }
         else if(gender.equals("male")){
             System.out.println("Mr."+firstname+" "+lastname+", hello!");
         }
        }
         else if (age<=20){
                if (gender.equals("male")){
                    System.out.println(firstname+" "+lastname+", hello!");
            }
                else if(gender.equals("female")){
                    System.out.println(firstname+" "+lastname+", hello!");
            }

        }



    }
}
