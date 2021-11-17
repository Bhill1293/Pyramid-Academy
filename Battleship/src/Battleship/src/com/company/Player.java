package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
        String name = "";
        public static ArrayList<Ship> playerShips = new ArrayList<>();
        public static ArrayList<String> moves = new ArrayList<>();
        GameBoard playerBoard = new GameBoard();

        public Player(){
    }

    public void addShips(){
        playerShips.addAll(Ship.ships);
    }

    public int numOfShipsLeft()
    {
        int counter = 5;
        for (Ship s: playerShips)
        {
            if (s.getCells()==0)
                counter--;
        }

        return counter;

    }

}
