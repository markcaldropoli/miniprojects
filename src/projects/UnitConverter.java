package projects;

import java.util.Scanner;

public class UnitConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What conversion would you like?");
		System.out.println("1: Fahrenheit to Celsius");
		System.out.println("2: Celsius to Fahrenheit");
		int input = sc.nextInt();
		
		if(input < 1 || input > 2) {
			System.out.println("Please run again with a valid input from 1-2.");
			sc.close();
			return;
		}
		
		System.out.println("Please type the value to convert:");
		double value = sc.nextDouble();
		String unit = "";
		
		if(input == 1) {
			value -= 32;
			value *= 5;
			value /= 9;
			unit = " Celsius";
		}
		
		if(input == 2) {
			value *= 9;
			value /= 5;
			value += 32;
			unit = " Fahrenheit";
		}
		
		System.out.println("Your result is "+value+unit);
		sc.close();
	}
}
