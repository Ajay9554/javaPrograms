package com.assignment1;
import java.util.Scanner;
public class gratestnum {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        double number1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double number2 = scanner.nextDouble();

	        if (number1 > number2) {
	            System.out.println(number1 + " is greater.");
	        } else if (number2 > number1) {
	            System.out.println(number2 + " is greater.");
	        } else {
	            System.out.println("Both numbers are equal.");
	        }

	        // Close the scanner
	        scanner.close();
	    }

}
