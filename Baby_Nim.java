package com.company;
import java.util.Scanner;
public class Baby_Nim {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    int a=3;
    int b=3;
    int c=3;

    System.out.print("A: "+a+"\tB: "+b+"\tC: "+c);
        System.out.println();
        while(a !=0 || b!=0 || c!=0) {
            System.out.print("Choose a pile: ");
            String choice=scanner.next();
            System.out.print("How many ro remove from pile "+choice+": ");
            int n=scanner.nextInt();
            if (choice.equals("A")){
                a=a-n;
            }
            else if(choice.equals("B")){
                b=b-n;
            }
            else if(choice.equals("C")){
                c=c-n;
            }
            System.out.print("A: "+a+"\tB: "+b+"\tC: "+c);
            System.out.println();
        }
        System.out.println();
        System.out.println("All piles are empty. Good job!");
    }
}
