package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 //Think Java - Exercise 5.7

        Scanner userInput = new Scanner(System.in);

        //Program waiting for user input.
        System.out.println("Insert the length of the first stick here:");

        while (!userInput.hasNextDouble()) {
            String word = userInput.next();
            System.err.println(word + " is not a valid!");
        }
        double lengthOne = userInput.nextDouble();
        System.out.println("Insert the length of the second stick here:");
        while (!userInput.hasNextDouble()) {
            String word = userInput.next();
            System.err.println(word + " is not a valid!");
        }
        double lengthTwo = userInput.nextDouble();
        System.out.println("Insert the length of the third stick here:");
        while (!userInput.hasNextDouble()) {
            String word = userInput.next();
            System.err.println(word + " is not a valid!");
        }
        double lengthThree = userInput.nextDouble();

        //Invoke method.
        calculateUserinput(lengthOne, lengthTwo, lengthThree);
    }
    public static void calculateUserinput(double lengthOne, double lengthTwo, double lengthThree) {

        //Variables.
        double callengthOne = lengthOne;
        double callengthTwo = lengthTwo;
        double callengthThree = lengthThree;

        //If statements.
        if (lengthOne <= 0 || lengthTwo <= 0 || lengthThree <= 0) {
            System.out.println("You can't form a triangle with zero length or a negative length.");
        }
        else if (lengthOne + lengthTwo <= lengthThree || lengthThree + lengthTwo <= lengthOne || lengthThree + lengthOne <= lengthTwo) {
            System.out.println("A triangle can be formed with the given lengths.");
        }
        else if (lengthOne + lengthTwo >= lengthThree || lengthThree + lengthTwo >= lengthOne || lengthThree + lengthOne >= lengthTwo) {
            System.out.println("A triangle can be formed with the given lengths.");
        }
    }
}
