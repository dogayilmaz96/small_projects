package com.company;

import java.util.Random;

public class basic_array_3 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] number= new int[1000];
        for(int i=0; i<number.length; i++){
            number[i]=10+random.nextInt(90);
            System.out.print(number[i]+"\t");
        }
    }
}
