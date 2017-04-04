package com.coboltojava;

import java.util.Scanner;

public class Multiplier {
	public static void main(String[] args) {

		int Num1;
		int Num2;
		int result;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter first number (1 digit):");
		Num1 = keyboard.nextInt();
		System.out.println("Enter second number (1 digit):");
		Num2 = keyboard.nextInt();
		result = Num1 * Num2;
		System.out.println("Result is = " + result);

	}

}
