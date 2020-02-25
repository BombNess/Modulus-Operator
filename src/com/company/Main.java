package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // todo even or odd
        //todo keep number contained
        //todo get the last digit
        //We want to find if a number is even or odd
        //We want to keep a number contained

        keepContained();
    }

    public static void testOddness() {
        Scanner Keyboard;
        System.out.println("Type a Positive Number");
        Keyboard = new Scanner(System.in);
        int number = Keyboard.nextInt();
        System.out.println("Number is even: " + (number % 2 ==0));
        System.out.println("Number is odd: " + (number % 2 !=0));


    }

    public static void keepContained() {
        Scanner Keyboard;
        Keyboard = new Scanner(System.in);
        System.out.println("Type a Positive Number");
        int number = Keyboard.nextInt();

        System.out.println("number contained is: " + ((number%8)+5));
    }
}
