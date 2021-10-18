package com.company;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner numScanner = new Scanner(System.in);
        Scanner endGame = new Scanner(System.in);
        Random random = new Random();

        int guesses = 3;
        int number = random.nextInt(50);

        System.out.println("Lets Play A Guessing Game!");
        System.out.println("I'm Thinking Of A Number Between 1 & 50.");
        System.out.println("Guess A Number: ");
        boolean gameOn=true;

        while (guesses > 0 && gameOn)
        {
            int numGuess = numScanner.nextInt();

            if (numGuess > number)
            {
                System.out.println("Too High, Guess Again. Guesses Left: " + guesses);
                guesses--;
                System.out.println("Guess A Number: ");
            } else if (numGuess < number)

            {
                System.out.println("Too Low, Guess Again. Guesses Left: " + guesses);
                guesses--;
                System.out.println("Guess A Number: ");
            }
            else if(numGuess == number)
            {
                System.out.println("You Guessed It!");
                System.out.println("Wanna Play Again? (Y/N): ");
                String reset = endGame.next();
                if(Objects.equals(reset, "Y"))
                {
                    number = random.nextInt(50);
                    guesses=3;
                    gameOn=false;
                    System.out.println("I'm Thinking Of A Number Between 1 & 50.");
                    System.out.println("Guess A Number: ");
                }
                else break;
            }

            if(guesses==0)
            {
                System.out.println("GAME OVER");
                gameOn=false;
                System.out.println("Wanna Play Again? (Y/N): ");
                String reset = endGame.next();
                if(Objects.equals(reset, "Y"))
                {
                    number = random.nextInt(50);
                    guesses=3;
                    gameOn=true;
                    System.out.println("I'm Thinking Of A Number Between 1 & 50.");
                    System.out.println("Guess A Number: ");
                }
                else
                    break;
            }
        }
    }
}
