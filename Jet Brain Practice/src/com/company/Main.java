package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //Scanner to find numbers for interval
        Scanner scanner = new Scanner(System.in);
        int startIncl= scanner.nextInt(),endExcl=scanner.nextInt();
        double sum=0;
        int divisCount=0;
        double result;
        //loop through to get every number between
        for(int i= startIncl ; i < endExcl ; i++) {
            if(i % 3 == 0){
                divisCount++;
                sum+=i;
            }
        }
        result = sum / divisCount;
        System.out.println(" " + result);
    }
}
