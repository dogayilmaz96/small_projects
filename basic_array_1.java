package com.company;

public class basic_array_1 {
    public static void main(String[] args) {
      int[] number= new int[10];
      for(int i=0; i<number.length; i++){
          number[i]=-113;
          System.out.println("Slot "+i+" contains a "+number[i]);
      }
    }
}
