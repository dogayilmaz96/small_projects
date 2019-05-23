package com.company;
import java.util.Scanner;
public class Two_More_Question {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("TEO MORE QUESTİONS BABY!!");
        System.out.println();
        System.out.println("Think of something. I ll try to guess it.");
        System.out.println();
        String a="";
        String b="";
        System.out.println("Question 1) Does it stay inside or outside or both? ");
        a= scanner.nextLine();
        System.out.println("Question 2) Is it a living thing? ");
        b=scanner.nextLine();
        if(a.equals("inside")&& b.equals("alive")){
            System.out.println("houseplant");
        }
        if(a.equals("inside")&& b.equals("not alive")){
            System.out.println("shower curtain");
        }
        if(a.equals("outside")&& b.equals("alive")){
            System.out.println("bison");
        }
        if(a.equals("outside")&&b.equals("not alive")){
            System.out.println("billboard");
        }
        if(a.equals("both")&&b.equals("alive")){
            System.out.println("dog");
        }
        if(a.equals("both")&&b.equals("not alive")){
            System.out.println("cell phone");
        }







    }















}
