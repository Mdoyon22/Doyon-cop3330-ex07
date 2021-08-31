/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.util.Scanner;


public class Main
{
    public static void main( String[] args )
    {
        int length, width, f2;

        Scanner inp = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        length = inp.nextInt();
        System.out.print("What is the width of the room in feet? ");
        width = inp.nextInt();

        f2 = length * width;
        final double m2 = f2 * 0.09290304;

        System.out.print("You entered dimensions of " + length + " feet by " + width + " feet." + "\n" + "The area is" + "\n" + f2 + " square feet" + "\n" + String.format("%.3f", m2) + " square meters");
    }
}
