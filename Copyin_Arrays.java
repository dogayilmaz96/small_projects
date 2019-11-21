package com.company;
import  java.util.Random;
public class Copyin_Arrays {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        System.out.print("Array 1: ");
        for (int i = 0; i <array1.length; i++) {
            array1[i] = random.nextInt(100);
            System.out.print(array1[i]+" ");
        }
        array2= array1;
        array1[9] = -7;
        System.out.println();
        System.out.print("Array 2: ");
        for (int i = 0; i <array2.length; i++) {
            System.out.print(array2[i]+" ");
        }
    }
}
