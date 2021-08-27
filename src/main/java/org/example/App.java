/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.Scanner;
public class App {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        String quote,whoSaidIt;
        System.out.print("What is the quote? ");
        quote = scan.nextLine();
        System.out.print("Who said it? ");
        whoSaidIt = scan.nextLine();
        System.out.print( whoSaidIt + " says, \"" + quote + "\"");
    }
}
