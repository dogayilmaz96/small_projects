package com.company;
import java.util.Random;
public class Fortune_Cookie {
    public static void main(String[] args) {
        Random random=new Random();
        int fortune=1+random.nextInt(6);
        String message="";
        if(fortune==1) {
            message="You will find happiness with a new love.";
        }
        else if(fortune==2){
            message="Today it's up to you to create the peacefulness you long for.";
        }
        else if(fortune==3){
            message="A friend asks only for your time not your money.";
        }
        else if(fortune==4){
            message="If you refuse to accept anything but the best, you very often get it.";
        }
        else  if(fortune==5) {
            message="A smile is your passport into the hearts of others.";
        }
        else if(fortune==6){
            message="Your high-minded principles spell success.";
        }
        System.out.println("Fortune cookie says: "+"\""+message+"\"");








    }
}
