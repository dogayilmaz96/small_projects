package com.company;
import java.util.Scanner;
public class Keychain_for_Sale_Ultimate_Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cost = 10;
        int keychain = 0;
        double salestax=0.0825;
        int ship=5;
        int pership=1;
        while (true) {
            System.out.println("Ye Olde Keychain Shoppe");
            System.out.println();
            System.out.println("1.Add Keychains to Order");
            System.out.println("2.Remove Keychains from Order");
            System.out.println("3.View Current Order");
            System.out.println("4.Checkout");
            System.out.println();
            System.out.print("Please enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println();
            if (choice == 1) {
                keychain = add_keychains(keychain);
                System.out.println();
            } else if (choice == 2) {
                keychain=remove_keychains(keychain);
                System.out.println();
            }
            else if(choice==3){
            view_order(keychain,salestax,ship,pership,cost);
                System.out.println();
            }
            else if(choice==4){
                System.out.println("CHECKOUT");
                System.out.println();
                System.out.print("What is your name? ");
                String name=scanner.next();
                view_order(keychain,salestax,ship,pership,cost);
                System.out.println("Thanks for your order, "+name+"!");
                break;
            }
        }
    }

    public static int add_keychains(int keychain) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You have " + keychain + ". How many to add? ");
        int add = scanner.nextInt();
        if (add >= 0) {
            keychain = keychain + add;
        } else {
            System.out.println("Please order a positive number of  keychain");
        }
        System.out.println("You now have " + keychain + " keychains.");
        return keychain;
    }

    public static int remove_keychains(int keychain) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You have " + keychain + " keychains.How many to remove? ");
        int remove=scanner.nextInt();
        keychain=keychain-remove;
        System.out.println("You now have "+keychain+" keychains.");

return keychain;
    }
    public static void view_order(int keychain, double salestax, int ship, int pership, double cost ){
        System.out.println("You know have "+keychain+" keychains.");
        System.out.println("Keychains cost $"+cost+" each.");
        System.out.println("The shipping charges on the order "+ship);
        cost=keychain*cost;
        System.out.println("The subtotal before tax "+cost+".");
        System.out.println("The tax on the order "+salestax);
        double total=cost+salestax*cost+pership+ship;
        System.out.println("The final cost of the order is "+total);
    }
}

