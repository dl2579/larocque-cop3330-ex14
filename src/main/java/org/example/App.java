package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.print( "What is the order amount? " );
        int amt = sc.nextInt();
        float subtotal = (float)amt;

        System.out.print("What is the state? ");
        sc.nextLine(); //throw away the next line not consumed by nextInt()
        String state = sc.nextLine();

        String output = String.format("The total is $%.2f%n", subtotal);

        if (state.equals("WI")){
            float taxR = 0.055f;
            float tax = taxR * amt;
            float total = subtotal + tax;
            output = String.format("The subtotal is $%.2f.%nThe tax is $%.2f.%nThe total is $%.2f.%n", subtotal, tax, total );
        }

        System.out.printf(output);
    }
}
