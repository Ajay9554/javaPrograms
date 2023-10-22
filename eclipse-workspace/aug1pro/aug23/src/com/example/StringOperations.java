package com.example;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1. Reverse a string");
        System.out.println("2. Count the length of a string");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();
        scanner.nextLine();  
        switch (choice) {
            case 1:
                System.out.print("Enter a string to reverse: ");
                String input = scanner.nextLine();
                String reversed = reverseString(input);
                System.out.println("Reversed string: " + reversed);
                break;
            case 2:
                System.out.print("Enter a string to count its length: ");
                String text = scanner.nextLine();
                int length = countStringLength(text);
                System.out.println("Length of the string is: " + length);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static int countStringLength(String text) {
        return text.length();
    }
}
