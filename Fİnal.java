package com.company;

public class Fİnal {
  //  public static final int height=2;
    public static void main(String[] args) {

    }
        /*line(13);
        line(7);
        line(35);
        line();
        body();
        line();
        topHalf();
        bottomHalf();
         printNumber(9,4);
        printNumber(6,17);
        printNumber(0,8);
        printNumber(8,0);
        System.out.println("Homer says: ");
        for(int i=1; i<=4; i++){
            System.out.println("I am so smart");
        }
        for(int h=1; h<=6; h++){
            System.out.println(h+" squared = "+(h*h));
        }
        System.out.println("+----+");
        for(int i=1; i<=3; i++){
            System.out.println("\\    /");
            System.out.println("/    \\");
        }
        System.out.println("+----+");
        System.out.println();
        int temp=5;
        for(int i=-3; i<=temp/2; i++){
            System.out.print((i*1.8+32)+" ");
        }
        System.out.print("T-minus ");
        for(int i=10; i>=1; i--){
            System.out.print(i+", ");
        }
        System.out.println("blastoff!");
        System.out.println("The end.");

        for (int i=1; i<=5; i++){
            for( int j=1; j<=10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i=1; i<=5; i++)
            System.out.println(5*i-3+" ");

    for (int i=1; i<=5; i++){
        System.out.print(i*(-4)+21+" ");
    }

        for(int i=1; i<=5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(".");
            }
            System.out.println(i);
        }
        for(int i=1;  i<=5; i++){
            for(int j=1; j<=-1*i+5; j++){
                System.out.print(".");
            }
            for(int k=1; k<=i; k++){
                System.out.print(i);
            }
            System.out.println();
        }



for (int i=1; i<=5; i++){
    for(int j=1; j<=-1*i+5; j++){
        System.out.print(".");
    }
    System.out.print(i);
    for(int k=1; k<=i-1; k++){
        System.out.print(".");
    }
    System.out.println();
}


for (int i=1; i<=12; i++){
    System.out.print("*");
}
System.out.println();
for (int i=1; i<=5; i++){
    System.out.print("*");
    for(int k=1; k<=10; k++) {
        System.out.print(" ");
    }
    System.out.println("*");
}
        for (int i=1; i<=12; i++) {
            System.out.print("*");
        }


    }
public static void topHalf(){
    System.out.print("#");
    for(int i=1; i<=16; i++){
        System.out.print("=");
    }
for (int i=1; i<=4; i++ ){
    System.out.print("|");
    for(int k=1; k<=-2*i+8; k++) {
        System.out.print(" ");
    }
    System.out.print("<>");
    for(int k=1; k<=4*i-4; k++){
        System.out.print(".");
    }
    System.out.print("<>");
    for (int k=1; k<=-2*i+8; k++){
        System.out.print(" ");
    }
    System.out.println("|");
}
}
public static void bottomHalf(){
        for(int i=1; i<=4; i++){
            System.out.print("|");
            for(int j=1; j<=2*i-2; j++){
                System.out.print(" ");
            }
            System.out.print("<>");
            for(int k=1; k<=-4*i+16; k++){
                System.out.print(".");
            }
            System.out.print("<>");
            for(int k=1; k<=2*i-2; k++){
                System.out.print(" ");
            }
            System.out.println("|");

        }
        System.out.print("#");
        for(int i=1; i<=16; i++){
            System.out.print("=");
        }
        System.out.print("#");

}
public static void line(){
        System.out.print("+");
        for (int i=1; i<=height*2; i++) {
            System.out.print("/\\");
        }
        System.out.println("+");
         }
         public static void body(){
        for(int i=1; i<=height; i++){
            System.out.print("|");
            for(int j=1; j<=height*4; j++){
                System.out.print(" ");
            }
            System.out.println("|");
        }


    }
    public static void line(int count){
        for(int i=1; i<=count; i++){
            System.out.print("*");
        }
        System.out.println();
    }

*/



        public static void printNumber(int count,int number){
            for(int i=1; i<=count; i++){
                System.out.print(number);
            }
            System.out.println();
        }
}
