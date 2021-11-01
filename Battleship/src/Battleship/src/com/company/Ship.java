package com.company;

import java.util.ArrayList;
public class Ship {
    public static ArrayList<Ship> ships = new ArrayList<>();

        public static boolean isOrientationSet;
        private String name;
        private int cells;

        Ship(String name, int cells,boolean isOrientationSet){
            this.name = name;
            this.cells = cells;
            this.isOrientationSet =isOrientationSet;
        }

        String getName(){
            return this.name;
        }

        int getCells(){
            return this.cells;
        }

        boolean getOrientation() {
            return this.isOrientationSet;
        }

        void setName(String n){
            name = n;
        }

        void setCells(int c){
            cells = c;
        }

        void setOrientation(boolean b){
            isOrientationSet= b;
        }
}