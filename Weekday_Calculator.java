package com.company;
import java.util.Scanner;
public class Weekday_Calculator {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
    System.out.println("All you have to do is enter your birth date, and it will tell you the day of the week on which you were born.");
        System.out.println("Some automatic tests....");





        System.out.println("Now it's your turn!  What's your birthday?");
        System.out.print("Birth date (mm dd yyyy): ");
        int m=scanner.nextInt();
        int d=scanner.nextInt();
        int y=scanner.nextInt();
        System.out.print("You were born on ");
        System.out.println(weekday(m,d,y));
        }

    public static String weekday(int m,int d, int y){
        String date="";
        String month="";
        if(m==1){
            month="January";
        }
        else if(m==2){
            month="February";
        }
        else if(m==3){
            month="March";
        }
        else if(m==4){
            month="April";
        }
        else if(m==5){
            month="May";
        }
        else if(m==6){
            month="June";
        }
        else if(m==7){
            month="July";
        }
        else if(m==8){
            month="August";
        }
        else if(m==9){
            month="September";
        }
        else if(m==10){
            month="October";
        }
        else if (m==11){
            month="November";
        }
        else if(m==12){
            month="December";
        }
        System.out.print(" "+month+" "+d+","+y+"!");

        return date;
    }
}
