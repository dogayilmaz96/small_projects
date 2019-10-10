package com.company;
import java.util.Random;
public class Fill_In_Functions {
    public static void main(String[] args) {
        Random random=new Random();
     System.out.println("Watch as we demonstrate functions");
     System.out.println();
     System.out.println("I'm going to get a random character from A-Z");
     System.out.print("The character is: ");
     char c=' ';
     randchar();
     System.out.println("The character is :"+randchar()+"(or whatever)");
     System.out.println();
     System.out.println("Now let's count from -10 to 10");
     counter(-10,10);
     System.out.println();
     System.out.println("Now we take the absolute value of a number.");
    abso(-10);
    System.out.println("That's all.  This program has been brought to you by: ");
    credits();

    }
    public static Character randchar(){
        Random random=new Random();
        int numval;
        char charval;
        numval=(1+random.nextInt(25));
        charval=(char)('A'+numval);
        return charval;
    }
    public static int counter(int b,int e){
        while(b <=e){
            System.out.print(b+" ");
            b++;
        }
        return b;
    }
    public static int abso(int value){
    int absvalue;
    if(value<0){
        absvalue=-value;
    }
    else{
        absvalue=value;
    }
        System.out.println("|"+value+"| ="+absvalue);
    return absvalue;
    }
    public static String credits(){
        System.out.println();
        System.out.println("programmed by Graham Mitchell");
        System.out.println("modified by [your name here]");
        System.out.print("This code is distributed under the terms of the standard ");
        System.out.println("BSD license.  Do with it as you wish.");
    return null;
    }
}
