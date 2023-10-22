package com.FileHandlingWork;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class FileWork {
//
//	public static void main(String[] args) {
//
//		String filePath = "Student.txt";
//
//		try {
//
//			FileWriter fw = new FileWriter(filePath);
//
//			BufferedWriter bw = new BufferedWriter(fw);
//			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the massage to store in file");
//			String data = sc.nextLine();
//			
//			bw.write(data);
//			bw.close();
//
//			if (DataWrite(filePath, data)) {
//				System.out.println("Your data has been stored in the file: " + filePath);
//			} else {
//				System.out.println("Failed to write data to the file.");
//			}
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//	}
//
//	private static boolean DataWrite(String filePath, String data) {
//
//		return false;
//	}
//
//}


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWork {
    public static void main(String[] args) {
        // Specify the file path where you want to create the new file
        String filePath = "Student.txt";


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the massage to store in file");
		String data = sc.nextLine();

        try {
             
            FileWriter bw = new FileWriter(filePath);
            
            
            bw.write(data);
            bw.close();
            
            System.out.println("Data stored");
        } catch (IOException e) {
            // Handle any exceptions that may occur during file operations
            System.out.println("Not stored");
            e.printStackTrace();
        }
    }
}

