package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner myObject = new Scanner(System.in);
        String Username;
        Scanner nameObject = new Scanner(System.in);


        System.out.println("""
                        You are in a land full of dragons\s
                        . In front of you, you see two caves.\s
                        In one cave, the dragon is friendly and will share his treasure with you . The other
                        dragon is greedy and hungry and will eat you on sight
                        .Which cave will you go into? (1 or 2))???");
                        """);

        int path = myObject.nextInt();

        switch (path) {

            case 1:
                System.out.println("""
                        You approach the cave...
                        It is dark and spooky...
                        A large dragon jumps out in front of you! He opens his jaws and...
                        Gobbles you down in one bite!""");
                break;
            case 2:
                System.out.println("'WHAT IS YOUR NAME?' asked a dark and gigantic voice.");
                Username = nameObject.nextLine();
                System.out.println("Well hello, " + Username + """ 
                                      . I am Eragon, the protector of this cave!
                                      I'm not sure what brings you here, but I've been alone for thousands of years.
                                      It's great to have company! Stay as long as you want, take as much gold as you like!""");
            default :
                if(path !=1 && path !=2)
                    System.out.println("Lol dragons don't exist......DORK!");
        }
    }
}
