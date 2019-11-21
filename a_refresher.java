package com.company;
import java.util.Scanner;
public class a_refresher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("What is your name: ");
        String name=scanner.next();
        if(name.equals("Mitchell")){
            for(int i=1; i<=5; i++){
                System.out.println(name);
            }
        }
        else {
            for(int i=1; i<=10; i++) {
                System.out.println(name);
            }
        }
    }
}
