package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
       /* int[] numbers= new int[10];
        numbers[0]=27;
        numbers[3]=-6;
        System.out.println(numbers[3]);
        double[] results= new double[5];
        results[2]=3.4;
        results[4]=-0.5;
        boolean[] tests= new boolean[6];
        tests[3]=true;
     int[] data= new int[8];
     numbers[1]=3;
     numbers[4]=99;
     numbers[6]=2;
    int x=numbers[1];
    numbers[x]=42;
    System.out.println(numbers[x]);
    numbers[numbers[6]]=11;
    System.out.println(numbers[2]);
    for(int i=0; i<8; i++){
        numbers[i]=2*i;
        System.out.println(numbers[i]);
    }
    System.out.println(numbers.length);
    Scanner  scanner= new Scanner(System.in);
    System.out.print("How many days' temperatures?");
    int days=scanner.nextInt();
    int temps[]=new int[days];
    int sum=0;
    int count=0;
    for(int i=0; i<days; i++){
        System.out.print("Day "+(i+1)+"'s high temp: ");
        temps[i]=scanner.nextInt();
        sum += temps[i];
    }
    double avarage=sum/days;
    for(int i=0; i<days; i++){
        if(temps[i]> avarage){
            count++;
        }
    }
    System.out.println("Avarage temp = "+avarage);
    System.out.println(count +" days above average.");


        Scanner  scanner= new Scanner(System.in);
           String word=scanner.next();
           char firstLetter=word.charAt(0);
           if(firstLetter==('c')){
               System.out.println("That's good enough for me");
           }
        String coolMajor="CSE";
           for(int i=0; i< coolMajor.length(); i++){
               System.out.println(coolMajor.charAt(i));
           }

int[] squares = new int[10];
for(int i=0; i<squares.length; i++){
    squares[i]=i*i;
}
System.out.print("[");
for(int i=0; i<squares.length; i++){
    if(i>0) {
        System.out.print(",");
    }
    System.out.print(squares[i]);
}
System.out.println("]");
*/
char[][] board= new char[3][3];
board[0][0]='x';
board[1][0]='o';
board[2][1]='x';

int[][] matrix= new int[3][4];
for(int i=0; i<matrix.length; i++){
    for(int j=0; j<matrix[0].length; j++){
        matrix[i][j]=i*j;
    }
}








    }
       }
