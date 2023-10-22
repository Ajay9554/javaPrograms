package com.FileHandlingWork;

import java.io.FileWriter;
import java.util.Scanner;

public class ReadFile {
	  public static void main(String args[]) {
		  System.out.println("Write the String ");
		  Scanner sc =new Scanner(System.in);
	    String data=   sc.nextLine();
		     
		     try {
		       // Creates a Writer using FileWriter
		       FileWriter output = new FileWriter("output.txt");

		       // Writes string to the file
		       output.write(data);
		       System.out.println("Data is written to the file");
		       

		       // Closes the writer
		       output.close();
		     }
		     catch (Exception e) {
		       e.getStackTrace();
		     }
		  }
		}