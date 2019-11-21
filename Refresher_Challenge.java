package com.company;
import java.util.Scanner;
public class Refresher_Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name=scanner.next();
        System.out.println();
        int times=10;
        if(name.equals("mitchell")){
            times=5;
        }
        for(int i=1; i<=times; i++){
            System.out.println(name);
        }
    }
}
