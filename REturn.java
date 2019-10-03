package com.company;

public class REturn {
    public static void main(String[] args) {
        System.out.println("10+20="+getIntSum(10,20));
        System.out.println("10*20="+getIntmulti(10,20));
        // double slope = slope(0,0,6,3);
        //System.out.println("The slope is "+slope);
    /*int result;
    int n;
    n=3;
    result=square(n);
    System.out.println("Square of 3 is:  "+result);
    n=4;
    result=square(n);
    System.out.println("Square of 4 is: "+result);
    }
    public static double slope(int x1, int y1, int x2, int y2){
        double dy=y2-y1;
        double dx=x2-x1;
        double result= dy/dx;
        return result;
    }
public static int square(int i){
    return i*i;
}

     */

    }
    public static int getIntSum(int i,int j){
        return i+j;
    }
    public static int getIntmulti(int x,int y){
        return x*y;
    }
}