package com.assignment1;
import java.util.Scanner;
public class threelargest {
            public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        double number1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double number2 = scanner.nextDouble();

	        System.out.print("Enter the third number: ");
	        double number3 = scanner.nextDouble();

	        double largest = number1; // Assuming the first number is the largest

	        if (number2 > largest) {
	            largest = number2;
	        }

	        if (number3 > largest) {
	            largest = number3;
	        }

	        System.out.println("The largest number among " + number1 + ", " + number2 + ", and " + number3 + "\n is: " + largest);

	        // Close the scanner
	        scanner.close();
	    }
	}

