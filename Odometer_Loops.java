package com.company;
import java.util.Scanner;
public class Odometer_Loops {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Which base (2-10): ");
        int i=scanner.nextInt();
        for (int thous=0; thous<i; thous++){
            for(int hund=0; hund<i; hund++){
                for(int tens=0; tens<i; tens++){
                    for(int ones=0; ones<i; ones++){
                        System.out.print(" "+thous+" "+hund+" "+tens+" "+ones+"\r");
                        Thread.sleep(500);
                    }
                }
            }
        }
    }
}
