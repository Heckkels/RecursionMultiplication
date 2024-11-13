package com.heck.recursionop1;
//A simple program to calculate the product of 5 user inputs using a recursive method. 

import java.util.Scanner;

public class RecursionMultiplicationExample {
	public static int RecursionCalc(int userNum) {
		Scanner scnr = new Scanner(System.in);
		
		int finalProduct;
		
		//Base Case: If any of the numbers are 0
		if (userNum == 0) {
			
			System.out.println();
			System.out.println("Any number multiplied by 0 will be 0.");
			finalProduct = userNum;
			
		}else {
			int userNum2;
			int userNum3;
			int userNum4;
			int userNum5;
			
			System.out.print("Please enter your second number: ");
			userNum2 = scnr.nextInt();
			
			System.out.print("Please enter your third number: ");
			userNum3 = scnr.nextInt();
			
			System.out.print("Please enter your fourth number: ");
			userNum4 = scnr.nextInt();
			
			System.out.print("Please enter your fifth number: ");
			userNum5 = scnr.nextInt();
			
			finalProduct = userNum * userNum2 * userNum3 * userNum4 * userNum5;
			scnr.close();
		}
		return finalProduct;
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int initialNum = 0;
		int finalCalc = 0;
		
		System.out.print("Please enter your first number: ");
		initialNum = scnr.nextInt();
		
		finalCalc = RecursionCalc(initialNum);
		
		System.out.println();
		System.out.println("Your final total is: " + finalCalc);
		
		scnr.close();
		
	}
}

	




