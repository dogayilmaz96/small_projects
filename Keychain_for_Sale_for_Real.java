package com.company;
import java.util.Scanner;
public class Keychain_for_Sale_for_Real {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ye olde Keychain Shoppe");
        System.out.println();
        int cost=10;
        int keychain=0;
        while (true){
        System.out.println("1. Add Keychains to Order");
        System.out.println("2. Remove keychain to Order");
        System.out.println("3.  View Current Order");
        System.out.println("4.Checkout");
        System.out.println();
        System.out.print("Please enter  your choice: ");
        int choice=scanner.nextInt();
            System.out.println();
        if(choice==1){
            keychain=add_keychains(keychain);
            System.out.println();
        }
        if(choice==2){
            keychain=remove_keychains(keychain);
            System.out.println();
        }
        if(choice==3){
           view_order(keychain);
        }
        if(choice==4){
            System.out.println("CHECKOUT");
            System.out.println();
            System.out.print("What is your name? ");
            String name=scanner.next();
            System.out.println("You have "+keychain+" keychains.");
            System.out.println("Keychains cost $"+cost+" each");
            System.out.println("Total cost is $"+(cost*keychain)+".");
            System.out.println("Thanks for your order, "+name+"!");
            break;
        }
            }
        }
        public static int add_keychains(int keychain){
        Scanner scanner=new Scanner(System.in);
            System.out.print("You have "+keychain+". How many to add? ");
            int add=scanner.nextInt();
            keychain=keychain+add;
            System.out.println("You now have "+keychain+" keychains.");
            return keychain;
        }
        public static int remove_keychains(int keychain){
        Scanner scanner=new Scanner(System.in);
            System.out.print("You have "+keychain+" keychains. how many to  remove? ");
            int remove=scanner.nextInt();
            keychain=keychain-remove;
            System.out.println("You now have "+keychain+" keychains.");
        return keychain;
        }
        public static int view_order(int keychain){
            int cost=10;
            System.out.println("You have "+keychain+" keychains.");
            System.out.println("Keychains cost $"+cost+" each.");
            System.out.println("Total cost is $"+(cost*keychain)+".");
            return keychain;
        }
    }

