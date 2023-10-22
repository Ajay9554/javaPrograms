package com.exercise1;
//
//public class PrintIntChar {
//
//	    // Method to print an integer followed by a character
//	    public void print(int n, char c) {
//	        System.out.println("Integer: " + n);
//	        System.out.println("Character: " + c);
//	    }
//
//	    // Method to print a character followed by an integer
//	    public void print(char c, int n) {
//	        System.out.println("Character: " + c);
//	        System.out.println("Integer: " + n);
//	    }
//
//	    public static void main(String[] args) {
//	        PrintIntChar printer = new PrintIntChar();
//
//	        // Call the first method with int followed by char
//	        printer.print(42, 'A');
//
//	        // Call the second method with char followed by int
//	        printer.print('B', 24);
//	    }
//	}
//
import java.util.Scanner;

public class PrintIntChar {
    // Method to print an integer followed by a character
    public void print(int n, char c) {
        System.out.println("Integer: " + n);
        System.out.println("Character: " + c);
    }

    // Method to print a character followed by an integer
    public void print(char c, int n) {
        System.out.println("Character: " + c);
        System.out.println("Integer: " + n);
    }

    public static void main(String[] args) {
        PrintIntChar printer = new PrintIntChar();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intInput = scanner.nextInt();
        System.out.print("Enter a character: ");
        char charInput = scanner.next().charAt(0);

        // Call the first method with int followed by char
        printer.print(intInput, charInput);

        System.out.print("Enter another character: ");
        charInput = scanner.next().charAt(0);
        System.out.print("Enter another integer: ");
        intInput = scanner.nextInt();

        // Call the second method with char followed by int
        printer.print(charInput, intInput);

        // Close the scanner
        scanner.close();
    }
}
