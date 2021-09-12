/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package Base;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //madlib inputs
        System.out.print("Enter a noun: ");
        String noun = in.nextLine();
        System.out.print("Enter a verb: ");
        String verb = in.nextLine();
        System.out.print("Enter a adjective: ");
        String adjective = in.nextLine();
        System.out.print("Enter a adverb: ");
        String adverb = in.nextLine();

        //single output madlib
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
