package com.company;

import java.util.Random;

public class basic_array_2 {
    public static void main(String[] args) {
        Random random = new Random();
    int[] number= new int[10];
    for(int i=0; i<number.length; i++){
        number[i]=1+random.nextInt(100);
        System.out.println("Slot "+i+" contains a "+number[i]);
    }
    }
}
