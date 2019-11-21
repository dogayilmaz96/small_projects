package com.company;
import java.util.Scanner;
public class Baby_Calculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean stop=false;
        while(stop==false) {
            System.out.print(">");
            String a=scanner.next();
            int first= Integer.parseInt(a.substring(0,1));
            char sign = a.charAt(1);
            int second = Integer.parseInt(a.substring(2,3));
        if(first != 0){
            if(sign=='+'){
                System.out.print(first+second);
            }
            else if(sign=='-'){
                if(first>second) {
                    System.out.print(first - second);
                }
                else{
                    System.out.print(second-first);
                }
            }
            else if(sign=='*'){
                System.out.print(first*second);
            }
            else  if(sign=='/'){
                if(first>second){
                    System.out.print((int)first/second);
                }
                else{
                    System.out.print((int)second/first);
                }

            }
            System.out.println();
        }
        else{
            System.out.println("Bye, now.");
            stop=true;
        }
        }
    }
}
