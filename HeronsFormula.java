package com.company;
public class HeronsFormula {
    public static void main(String[] args) {
    double area;
    area=Triangle(3,3,3);
    System.out.println("A triangle with sides 3,3,3 has an area of "+ area);
    area=Triangle(3,4,5);
    System.out.println("A triangle with sides 3,4,5 has an area of "+area);
    area=Triangle(7,8,9);
    System.out.println("A triangle with sides 7,8,9 has an area of "+area);
    area=Triangle(5,12,13 );
    System.out.println("A triangle with sides 5,12,13 has an area of "+area);
    area=Triangle(10,9,11);
    System.out.println("A triangle with sides 10,9,11 has an area of "+area);
    area=Triangle(8,15,17);
    System.out.println("A triangle with sides 8,15,17 has an area of "+area);
    area=Triangle(9,9,9);
    System.out.println("A triangle with sides 9,9,9 has an area of "+area);

    }
    public static double Triangle (int a, int b, int c) {
        double area;
        double U;
        U = (a + b + c) / 2;
        area=Math.sqrt(U*(U-a)*(U-b)*(U-c));
        return area;
    }
}
