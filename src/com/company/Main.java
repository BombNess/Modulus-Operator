package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // todo even or odd
        //todo keep number contained
        //todo get the last digit
        //We want to find if a number is even or odd
        testOddness();
    }

    public static void testOddness() {
        Scanner Keyboard;
        System.out.println("Type a Positive Number");
        Keyboard = new Scanner(System.in);
        int number = Keyboard.nextInt();
        System.out.println("Number is even: " + (number % 2 ==0));
        System.out.println("Number is odd: " + (number % 2 !=0));


    }
}
