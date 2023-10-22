package com.example;

import java.util.Scanner;

public class exp {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int sum = 0;
		        int numberOfSubjects = 5; // Assuming 5 subjects
		        String[] subjectNames = {"Math", "English", "Science", "History", "Art"};
		        
		        for (int i = 0; i <= numberOfSubjects; i++) {
		            int mark;
		            do {
		                System.out.print("Enter the mark for subject " + subjectNames[i] + ": ");
		                mark = scanner.nextInt();
		                
		                if (mark < 0 || mark > 100) {
		                    System.out.println("Invalid input. Marks must be between 0 and 100.");
		                }
		            } while (mark < 0 || mark >100);
		            
		            sum += mark;
		        }
		        
		        System.out.println("Total marks: " + sum);
		        
		        // Close the scanner
		        scanner.close();
		   
		 
}}
  


