package com.company;

public class Eveness_Function {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++){
            System.out.print(i);
            if(i%2==0){
                System.out.println("<");
            }
            else if(i%3==0){
                System.out.println("=");
            }
            else if(i%6==0){
                System.out.println("<=");
            }
            else{
                System.out.println();
            }
    }
    }
    public static boolean isDivisibleBy3( int n ){
        if(n%3==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
