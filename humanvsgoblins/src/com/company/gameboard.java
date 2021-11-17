package com.company;

import java.util.Arrays;

public class gameBoard {
    private final int numRow = 15;
    private final int numColumn = 15;
    int [][] gameBoard = new int [numRow][numColumn];

    public gameBoard() {
        fillGameBoard();
    }

    public void fillGameBoard() {
        for (int[] row : gameBoard) {
            Arrays.fill(row, Integer.parseInt("~ "));
        }
    }

    public void displayPosition() {
        // this is filling the array NOT PRINTING.... But organizes chars
        //Add additional functionality for features that will pertain to board....HITS,MISSES,OCCUPATION
        System.out.println("  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15");

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (j == 0) {
                    System.out.print((i + 1) + " " + gameBoard[i][j]);
                } else {
                    System.out.print(gameBoard[i][j]);
                }
                if (j == 14) {
                    System.out.print("\n");
                }
            }
        }
    }
}

