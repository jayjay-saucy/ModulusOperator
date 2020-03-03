package com.company;

import java.util.Scanner;

public class Main {

    public static void testOdness(){
        testOdness();

    }
    public static void main(String[] args) {
	// todo even or odd
        // todo keep number contained
        // todo get the last digit
        //We want to find out if a number is even or odd
        // is even ==
        // is not even !=
        System.out.println("Give me a number between 1-100. ");
Scanner keyboard;

    keyboard = new Scanner(System.in);
    keyboard.nextLine();
    int number = 17;
    System.out.println("Number is even: "+(number % 2 == 0));
        System.out.println("Number is odd: "+(number % 2 != 0));
    }
}
