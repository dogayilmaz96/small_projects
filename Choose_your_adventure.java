
package com.company;
import java.util.Scanner;
public class Choose_your_adventure {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String first="";
        String second="";
        String third="";
        System.out.println("Welcome to Doğa's tiny adventure!");
        System.out.println();
        System.out.println("You're in a creepy house! Would u like to got \"upstairs\" or into the \"kitchen\"?");
        first=scanner.nextLine();

        if(first.equals("kitchen")){
            System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigeratoror\" or look inn a \"cabinet\".");
            second=scanner.nextLine();
            if(second.equals("refrigerator")){
                System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. /nWould you like to eat some of the food? \"yes\" or \"no\"");
                third=scanner.nextLine();
                if(third.equals("no")){
                    System.out.println("You die of starvation... eventually.");
                }
                else if(third.equals("yes")){
                    System.out.println("You survived. Congrats!");
                }
            }

                else if(second.equals("cabinet")){
                System.out.println("There is a coat and a pair of shoes. Which one would you like to get?");
                third=scanner.nextLine();
                    if(third.equals("coat")){
                    System.out.println("Congrats! U survived.");
                }
                    else if(third.equals("shoes")){
                    System.out.println("You die of hypotermia");
                }
            }
        }
        else if(first.equals("upstairs")){
            System.out.println("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\". There is also a \"bathroom\" off the hallway. Where would you like to go?");
            second=scanner.nextLine();
            if(second.equals("bedroom")){
                System.out.println("You're in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. ın the back of the room, the closet door is ajar. Would you open the door? (\"yes\" or \"no\" ");
                third=scanner.nextLine();
                if(third.equals("no")){
                    System.out.println("I guess you'll never know what was in there.Thanks for playing.");
                }
                else if(third.equals("yes"));
                System.out.println("Congrats! You escape the house. It' s door that opens to outside.");
            }
            else if(second.equals("bathroom")){
                System.out.println("You're in a bathroom. There are painkillers and some clean clothes.You can only pick one of them.Which is it?");
                if(third.equals("painkiller")){
                    System.out.println("Sorry you die of consumption of posion.");
                }
                else if(third.equals("clean clothes")){
                    System.out.println("You are now good to go.");
                }
            }
        }
    }
}
