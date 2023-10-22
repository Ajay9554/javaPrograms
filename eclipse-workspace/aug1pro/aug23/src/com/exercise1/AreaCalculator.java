package com.exercise1;
	import java.util.Scanner;
	
	public class AreaCalculator {
	    // Method to calculate and print the area of a rectangle
	    public void calculateArea(int length, int breadth) {
	        int area = length * breadth;
	        System.out.println("Area of Rectangle: " + area);
	    }

	    // Method to calculate and print the area of a square
	    public void calculateArea(int side) {
	        int area = side * side;
	        System.out.println("Area of Square: " + area);
	    }

	    public static void main(String[] args) {
	        AreaCalculator calculator = new AreaCalculator();

	        Scanner scanner = new Scanner(System.in);

	        // Take user input for length and breadth of the rectangle
	        System.out.print("Enter length of rectangle: ");
	        int length = scanner.nextInt();
	        System.out.print("Enter breadth of rectangle: ");
	        int breadth = scanner.nextInt();

	        // Calculate and print the area of the rectangle
	        calculator.calculateArea(length, breadth);

	        // Take user input for the side of the square
	        System.out.print("Enter the side of square: ");
	        int side = scanner.nextInt();

	        // Calculate and print the area of the square
	        calculator.calculateArea(side);

	    }
	}

