package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {

		System.out.println("Please enter the amount of the bill:");

		Scanner scanner = new Scanner(System.in);

		double billAmount = Double.parseDouble(scanner.nextLine());

		System.out.println("Please enter the amount tendered:");

		double tenderedAmount = Double.parseDouble(scanner.nextLine());

		System.out.println("The change required is " + countChange(billAmount, tenderedAmount) + "$");

	}

	private static double countChange(double bill, double tendered) {
		double result = 0.0;

		result = tendered - bill;

		return result;
	}
}
