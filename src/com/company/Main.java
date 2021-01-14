//Week8 Day4: Intro to Java with Erik
//Slide Deck: Java Introduction (Code Immersion 2020)
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Hola Mundo");
        System.out.println("Hello Java");

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = input.nextLine();
        System.out.println("\nYour first name is:" + firstName);

        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        System.out.println("\nYour last name is:" + lastName);

        System.out.println("How old are you?");
        String age = input.nextLine();
        System.out.println("\nYou are:" + age);

        System.out.printf("\nHello %s %s!\n" +
                "How does it feel to be %s years young?\n",
                firstName, lastName, age);

        System.out.println("\nLet's play a game! \nEnter a name:");
        String name = input.nextLine();
        System.out.println("\nEnter an adverb:");
        String adverb = input.nextLine();
        System.out.println("\nEnter a noun:");
        String noun1 = input.nextLine();
        System.out.println("\nEnter another noun:");
        String noun2 = input.nextLine();
        System.out.println("\nEnter an adjective:");
        String adjective = input.nextLine();
        System.out.println("\nEnter a verb:");
        String verb = input.nextLine();
        System.out.println("\nEnter a number:");
        String number = input.nextLine();

        System.out.printf("\nDear %s, \n\nYou are %s " +
                "and I want to be your %s! \nI would %s to go to the %s " +
                "with you in %s days.\n\nLove %s\n\n",
                name, adjective, noun1, verb, noun2, number, firstName);

        //casting is converting, slides 32-33
//        byte b = (byte)34;
//        System.out.println(b);
//
//        int numberAbove = Integer.parseInt(number);
//        System.out.println(numberAbove);

        Animal myPet = new Animal("Vin Cecil", 6, 18);
        System.out.println("My Pet info: " + myPet);
    }
}
