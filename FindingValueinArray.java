package com.company;
import java.util.Random;
import java.util.Scanner;
public class FindingValueinArray {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner= new Scanner(System.in);
        int [] array=new int[10];
        for(int i=0; i<array.length; i++){
            array[i]=random.nextInt(50);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("Value to find: ");
        int value=scanner.nextInt();
        for(int i=0; i<array.length; i++){
            if(value==array[i]){
                System.out.println(value+" is in the array.");
            }

        }

    }
}
