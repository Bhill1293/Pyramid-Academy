package com.company;

import java.util.ArrayList;
import java.util.Scanner;




public class Main {
    static Scanner scanner = new Scanner(System.in);
    static GameBoard game = new GameBoard();

    public static void main(String[] args) {
        ArrayList<Ship> ships = new ArrayList<>();
        Ship.ships.add(new AirCarrier());
        Ship.ships.add(new Submarine());
        Ship.ships.add(new Cruiser());
        Ship.ships.add(new Battleship());
        Ship.ships.add(new Patrol());

        game.displayPositions();
        for(Ship shipType: Ship.ships){
            setPositions("Enter the coordinates of the "+ shipType.getName()+" (" + shipType.getCells()+" cells)", shipType.getCells());
        }
        game.displayPositions();
    }

    //SHIP CLASS//
    //Account for vertical or horizontal
    //If hit,miss,or killed


    //PLAYER CLASS//
    //Holds SHIP data*
    //Win or Loss
    //Move data, throw exception if out of bounds

    static void setPositions(String text, int length) {
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        String p1 = scanner.next();
        String p2 = scanner.next();
        game.setPosition(p1, p2, length );
    }
}



