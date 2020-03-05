package com.company;

import java.util.Scanner;

public class Main {
    public static void keepContained(){
        keepContained();
    }

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
Scanner keyboard;
    keyboard = new Scanner(System.in);
    int number =4;


        // want to keep number contained
        System.out.println("give me a number between 1-5");
        keyboard.nextLine();
        System.out.println("number contained is: Modulous Operation number is" + number);
         number = 0;
        System.out.println((number%5)+1);

         number = 1;
        System.out.println((number%5)+1);

         number = 2;
        System.out.println((number%5)+1);

         number = 3;
        System.out.println((number%5)+1);

         number = 4;
        System.out.println((number%5)+1);

         number = 5;
        System.out.println((number%5)+1);

        number = 6;
        System.out.println((number%5)+1);

        number = 7;
        System.out.println((number%5)+1);

        number = 8;
        System.out.println((number%5)+1);


    }
}
