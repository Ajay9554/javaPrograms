package com.assignment1;
import java.util.Scanner;
public class divi {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (number % 5 == 0) {
	            System.out.println(number + " is divisible by both 5 and 9.");
	        }
	        else if(number % 9 == 0) {
	        	System.out.println(number + " is divisible 9.");
	        }
	        else if (number % 5 == 0 && number % 9 == 0) {
	        	System.out.println(number + " is divisible by both 5 and 9.");
	        }
	        else {
	            System.out.println(number + " is not divisible by both 5 and 9.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}

