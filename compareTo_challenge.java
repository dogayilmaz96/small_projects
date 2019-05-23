package com.company;

public class compareTo_challenge {
    public static void main(String[] args) {

        String dog = "dog";
        String cat = "cat";
        String turtle = "turtle";
        String elephant = "elephant";
        String dolphin = "dolphin";
        String bat = "bat";
        String monkey = "monkey";
        String lion = "lion";
        int a= "dog".compareTo("cat");
        int b="cat".compareTo("bat");
        int c="turtle".compareTo("cat");
        int d="elephant".compareTo("turtle.");
        int e="dolphin".compareTo("elephant");
        int f="bat".compareTo("dolphin");
        int g="monkey".compareTo("bat");
        int h="lion".compareTo("monkey");

        System.out.println("Comparing \"dog\" with \"cat\" produces "+a);
        System.out.println("Comparing \"cat\" with \"bat\" produces "+b);
        System.out.println("Comparing \"turtle\" with \"cat\" produces "+c);
        System.out.println("Comparing \"elephant\" with \"turtle\" produces "+d);
        System.out.println("Comparing \"dolphin\" with \"elephant\" produces "+e);
        System.out.println("Comparing \"bat\" with \"dolphin\" produces "+f);
        System.out.println("Comparing \"monkey\" with \"bat\" produces "+g);
        System.out.println("Comparing \"lion\" with \"monkey\" produces "+h);

    }
}
