package com.company;
import java.util.Random;
import java.util.Scanner;
public class Three_Card_Monte {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int right=1+random.nextInt(3);
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
        System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
        System.out.println("He lays down three cards.");
        System.out.println();
        System.out.println("Which one is the ace?");
        System.out.println();
        System.out.println("##  ##  ##");
        System.out.println("##  ##  ##");
        System.out.println("1   2   3");
        System.out.print(">");
        int guess=scanner.nextInt();
        if(guess!=right){
            System.out.println("Ha! Fast Eddie wins again! The ace was card number "+right);
           System.out.println();
            if(right==1){
                System.out.println("AA  ##  ##");
                System.out.println("AA  ##  ##");
                System.out.println("1   2   3");
            }
            else if(right==2){
                System.out.println("##  AA  ##");
                System.out.println("##  AA  ##");
                System.out.println("1   2   3");
            }
            else if(right==3){
                System.out.println("##  ##  AA");
                System.out.println("##  ##  AA");
                System.out.println("1   2   3");
            }
        }
        else if(guess==right){
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
        System.out.println();
        if(right==1) {
            System.out.println("AA  ##  ##");
            System.out.println("AA  ##  ##");
            System.out.println("1   2   3");
        }
        else if(right==2){
            System.out.println("##  AA  ##");
            System.out.println("##  AA  ##");
            System.out.println("1   2   3");
        }
        else if(right==3){
            System.out.println("##  ##  AA");
            System.out.println("##  ##  AA");
            System.out.println("1   2   3");
        }


        }



    }
}
