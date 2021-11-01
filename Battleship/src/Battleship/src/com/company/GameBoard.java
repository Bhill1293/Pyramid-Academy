package com.company;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class GameBoard {
    public int numRows = 9;
    public int numColumns = 9;
    String[][] gameBoard = new String[9][9];

    public GameBoard() {
        fillGameBoard();
    }

    public void fillGameBoard(){
        for (String[] row : gameBoard) {
            Arrays.fill(row, "~ ");
        }
    }
    public void displayPositions()
    {
        // this is filling the array NOT PRINTING.... But organizes chars
        //Add additional functionality for features that will pertain to board....HITS,MISSES,OCCUPATION
        int rows = 9, columns = 9;
        char miss='X';
        char hit = '*';

        System.out.println("  1 2 3 4 5 6 7 8 9");

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (j == 0) {
                    System.out.print(getLetter(i+1) + " " + gameBoard[i][j]);
                } else {
                    System.out.print(gameBoard[i][j]);
                }
                if (j == 8) {
                    System.out.print("\n");
                }
            }
        }
    }

    //Method to set COLUMN values as ASCII for gamedisplay
    public char getLetter(int i){
        return (char) (i + 64);
    }
    //Method to return COLUMN value to Int for Coordinate check
    //https://github.com/ShainaR/Battleship/blob/master/gameboard.java
    public int getInt(char input) {
        return switch (input) {
            case 'A' -> 0;
            case 'B' -> 1;
            case 'C' -> 2;
            case 'D' -> 3;
            case 'E' -> 4;
            case 'F' -> 5;
            case 'G' -> 6;
            case 'H' -> 7;
            case 'I' -> 8;
            case 'J' -> 9;
            default -> -1;
        };
    }

//Sets positions to board.... (Help from Starlin Leon)
    public void setPosition (String p1, String p2, int cells){
            int x = getInt(p1.charAt(0));
            int x2 = Integer.parseInt(p1.split("")[1]);
            int y = getInt(p2.charAt(0));
            int y2 = Integer.parseInt(p2.split("")[1]);
            //11 55

            if(x > y){
                int holder = x;
                x = y;
                y = holder;
            }

            for(int n = x; n <= y; n++){

                for(int m = x2; m <= y2; m++){
                    gameBoard[n][m]  = "O ";
                 }
            }
        }

}


