package com.company;

public class Number_Puzzle_4 {
    public static void main(String[] args) {
       for(int a=0; a<=45; a++){
           for(int b=0; b<=45; b++){
               for(int c=0; c<=45; c++){
                   for(int d=0; d<=45; d++){
                       if(a+b+c+d==45){
                           if(a+2==b-2 && c*2==d/2 && a+2==c*2){
                               System.out.println(a+","+b+","+c+","+d);
                           }
                       }
                   }
               }
           }
       }

    }
}
