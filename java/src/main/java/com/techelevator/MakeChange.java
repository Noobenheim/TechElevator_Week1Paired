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

		//System.out.println("The change required is " + countChange(billAmount, tenderedAmount) + "$");
		
		System.out.print("The change required is ");
	    System.out.format("%.2f$",countChange(billAmount, tenderedAmount));
		
	    
	    
		// I accidentally heard someone talking about rounding the result in this one, 
		// So I tested ours as well : 
		//
		// 88.88 - 100 returns 11.120000000000005$ which is not really correct
		// 
		// so we found a way to format it 
		//
		//System.out.print("The change required is ");
		//System.out.format("%.2f$",countChange(billAmount, tenderedAmount));
		//
		// there are some different ways of rounding/formating the result
		// I came across regular expressions, 
		// than Andrew explained some stuff about it, so I commented our version - line 28
	    // and 30, 31 are the replacement
	    // I don't think it really matters, but probably better to have it right =)
		
		
	}

	private static double countChange(double bill, double tendered) {
		double result = 0.0;

		result = tendered - bill;

		return result;
	}
}
