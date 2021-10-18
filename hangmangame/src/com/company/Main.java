package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        //Word library altered. Original found from Medium.com
        String[] WORDS = {
                "BREAK", "BYTE",
                "CASE", "CART", "CHARM",
                "CONTINUE", "DEFAULT", "DOUBLE", "DO",
                "NUMB","FALSE", "FINAL", "FLOAT", "FOR", "GOAT", "IF",
                "IMPORT","INTERFACE","LONG",
                "NATIVE", "NEW", "PRIVATE","PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC",
                "STRICT", "SUPER", "SWITCH", "SYNCHRONIZED",
                "THIS", "THROW", "THORN", "TRANSIENT", "TRUE",
                "TRY", "VOID", "VOLATILE", "WHILE"
        };

        // generates a random int that corresponds to index in WORDS array
        //Initiates game
        Random randomNum = new Random();
        int ranWord = randomNum.nextInt(WORDS.length);
        String wordPick = WORDS[ranWord];
        char[] wordLetters = new char[wordPick.length()];
        Arrays.fill(wordLetters, '_');


        System.out.println(wordLetters);
        //Test to see if word is being output
        System.out.println(WORDS[ranWord]);

        Scanner myObj = new Scanner(System.in);
        Scanner restart = new Scanner(System.in);
        //Letter Check/Guesses

        int guesses = 3;
        int remLetters = wordPick.length();
        ArrayList<Character> letters = new ArrayList<>();
        boolean oldGuess = false;
        while (guesses > 0 && remLetters > 0) {
            System.out.println("Guesses Left: " + guesses);
            System.out.println("Guess A Letter");
            char guessedChar = Character.toUpperCase(myObj.next().charAt(0));

            for (int i = 0; i < wordPick.length(); i++) {
                if (letters.contains(guessedChar)) {
                    System.out.println("You have already guessed that letter. Choose again.");
                    oldGuess = true;
                    break;
                }
                if (guessedChar == wordPick.charAt(i)) {
                    wordLetters[i] = guessedChar;
                    letters.add(guessedChar);
                    --remLetters;
                    guesses++;
                    break;
                }
            }

            if (!oldGuess) {
                guesses--;
            }
            System.out.println(wordLetters);

            oldGuess = false;
            if (remLetters == 0)
            {
                System.out.println("You Win.Play Again? (Y/N)");
                String restartOption = restart.nextLine();
                if(restartOption.equals("Y"))
                {
                    wordPick=WORDS[ranWord];
                }
                else
                    break;
            }
            else if(guesses==0)
            {
                System.out.println("Game Over.Play Again? (Y/N)");
                String restartOption = restart.nextLine();
                if(restartOption.equals("N"))
                {
                    wordPick=WORDS[ranWord];
                }
                else
                    break;
            }
        }
    }

}