/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex12;

import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principal = in.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = in.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = in.nextInt();

        double result = principal * (1 + ((rate/100) * years));
        result = Math.ceil(result*100)/100;

        System.out.println("After " + years + " years at " + rate + "%, the investment will be worth $" + result + ".");

    }
}
