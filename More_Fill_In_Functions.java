package com.company;
import java.util.Scanner;
public class More_Fill_In_Functions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Here we go");
        System.out.println();
        System.out.println("Some random numbers, if u please:");
        int value1=2;
        int value2=8;
        int low=1;
        int high=10;
        superrand(low,high);
        System.out.println("First: "+value1);
        superrand(high,low);
        System.out.println("Second: "+value2);
        if(value1==value2){
            System.out.println("Hey! They were the same!");
        }
        else{
            System.out.println("They were not the same");
        }
        System.out.println();
        System.out.print("More counting,but this time not by ones: ");
        stepcount(2,8,2);
        stepcount(10,2,2);
        System.out.println();
        System.out.println("Let's  figure a project grade.");
        int g1=4;
        int g2=3;
        int g3=4;
        int g4=5;
        int g5=2;
        int g6=1;
        int result=project_grade(g1,g2,g3,g4,g5,g6);
        System.out.println("434521-> "+result);
    System.out.println();
    System.out.println("Finally,some easy ones.");
    System.out.println();


    }
    public static int superrand(int a,int b){
        int c=0;
        if(a<b){
            c=a+(int)(Math.random()*(b-a+1));
        }
        else if(a>b){
            c=b+(int)(Math.random()*(a-b+1));
        }
        else{
            c=a;
        }
        return c;
    }
    public static int stepcount(int first ,int last,int step){
        int x=0;
        if(last>first){
            x=first;
            while(x<=last){
                System.out.print(x+" ");
                x=x+step;
            }
        }
            else if(first>last){
                x=first;
                while (x>=last){
                    System.out.print(x+" ");
                    x=x-step;
                }
            }
        return x;
    }
    public static int project_grade(int g1, int g2, int g3, int g4, int g5, int g6){
        int overall_grade=0;
        overall_grade=g1*6;
        overall_grade=overall_grade+g2*6;
        overall_grade=overall_grade+g3*4;
        overall_grade=overall_grade+g4*2;
        overall_grade=overall_grade+g5*1;
        overall_grade=overall_grade+g6*1;
        return overall_grade;
    }
    public static String get_name(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name=scanner.next();
        return name;
    }
}
