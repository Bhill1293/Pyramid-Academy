package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Ship {
        public static ArrayList<Ship> ships = new ArrayList<>();
        public static boolean isOrientationSet;
        private String name;
        public int cells;

        Ship(String name, int cells,boolean isOrientationSet){
            this.name = name;
            this.cells = cells;
        }

        String getName(){
            return name;
        }

        int getCells(){
            return cells;
        }

        boolean getOrientation() {
            return isOrientationSet;
        }

        public void setName(String n){
            name = n;
        }

        public void setCells(int c){
            cells = c;
        }
//
//        public boolean isShipSet (Ship shipType, ArrayList<Ship> ships, GameBoard board){
//            int count = 0 ;
//            for (int i = 0; i < shipType.getCells() ; i++) {
//                if(shipType.)
//            }
//        }
}