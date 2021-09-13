/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Terry
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        double subtotal;
        double tax = 0;
        double total;

        Scanner input = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double order_amount = input.nextDouble();
        input.nextLine();

        System.out.print("What is the state? ");
        String state = input.nextLine();

        subtotal = order_amount;
        total = subtotal;

        if(state.equals("WI"))
        {
            tax = (5.5/100);
            total = total + (order_amount*tax);
            System.out.printf("The subtotal is $%.2f.%n", order_amount);
            System.out.printf("The tax is $%.2f.%n", tax*subtotal);
            System.out.printf("The total is $%.2f.", total);
        }
        else
        {
            System.out.printf("The total is $%.2f.", total);
        }
    }
}