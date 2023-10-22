package com.example2;

import java.util.Scanner;

public class Students {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int Subjects = 5;
        
        String[] subjectNames = {"Math", "English", "Science", "History", "Art"};
        
        for (int i = 0; i < Subjects; i++) {
            int mark;
            
            do {
                System.out.print("Enter the mark for " + subjectNames[i] + ": ");
                mark = scanner.nextInt();
                
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid input. Marks must be between 0 and 100.");
                }
            } while (mark < 0 || mark > 100);
            
            sum += mark;
        }
        
        System.out.println("Total marks: " + sum);

        // Calculate percentage
        double percentage = (sum / (Subjects * 100.0)) * 100.0;

        System.out.println("Percentage: " + percentage + "%");

        // Determine grade based on percentage
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        
         // Close the scanner
        scanner.close();
        
    }
}

