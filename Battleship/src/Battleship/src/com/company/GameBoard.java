package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class GameBoard {

    String[][] gameBoard = new String[9][9];
    public ArrayList<Ship> inGameStatus = new ArrayList<>();

    public GameBoard() {
        fillGameBoard();
    }

    public void fillGameBoard() {
        for (String[] row : gameBoard) {
            Arrays.fill(row, "~ ");
        }
    }

    public void displayPositions() {
        // this is filling the array NOT PRINTING.... But organizes chars
        //Add additional functionality for features that will pertain to board....HITS,MISSES,OCCUPATION
        char miss = 'X';
        char hit = '*';

        System.out.println("  1 2 3 4 5 6 7 8 9");

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (j == 0) {
                    System.out.print(getLetter(i + 1) + " " + gameBoard[i][j]);
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
    public char getLetter(int i) {
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
    public void setPosition(String head, String tail, int cells) {
        int x = getInt(head.charAt(0));
        int x2 = Integer.parseInt(head.split("")[1]);
        int y = getInt(tail.charAt(0));
        int y2 = Integer.parseInt(tail.split("")[1]);
        //11 55

        if (x > y) {
            int holder = x;
            x = y;
            y = holder;
        }

        for (int n = x; n <= y; n++) {

            for (int m = x2; m <= y2; m++) {
                gameBoard[n][m] = "O ";
            }
        }
    }

    public void checkHit(String shot) {
        boolean isHit = false;
        int x = getInt(shot.charAt(0));
        int x2 = Integer.parseInt(shot.split("")[1]);
        for(Ship shipType: Ship.ships) {
            if (gameBoard[x][x2].equals(String.valueOf("~ "))) {
                System.out.println("You missed!");
                gameBoard[x][x2] = "X ";
            }
        }
        if(gameBoard[x][x2].equals(String.valueOf("O "))){
            isHit = true;
            System.out.println("HIT!");
            gameBoard[x][x2] = "* ";
    }
    displayPositions();
    }

    public void attackShip() {
    }
}


