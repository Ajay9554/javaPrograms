
  package com.exercise1;
  
/*
 * import java.util.Scanner;
 *  public class overloadingJava {
 * 
 * public void printIntChar(int n, char c) { System.out.println("Integer: " + n
 * + ", Character: " + c); }
 * 
 * public void printIntChar(char c, int n) { System.out.println("Character: " +
 * c + ", Integer: " + n); }
 * 
 * public static void main(String[] args) { Scanner scanner = new
 * Scanner(System.in);
 * 
 * overloadingJava printer = new overloadingJava();
 * 
 * System.out.print("Enter an integer: "); int intInput = scanner.nextInt();
 * 
 * System.out.print("Enter a character: "); char charInput =
 * scanner.next().charAt(0);
 * 
 * printer.printIntChar(intInput, charInput);
 * 
 * System.out.print("Enter another character: "); charInput =
 * scanner.next().charAt(0);
 * 
 * System.out.print("Enter another integer: "); intInput = scanner.nextInt();
 * 
 * printer.printIntChar(charInput, intInput); } }
 */

  public class overloadingJava  {
	    public void printIntChar(int n, char c) {
	        System.out.println("Integer: " + n + ", Character: " + c);
	    }

	    public void printIntChar(char c, int n) {
	        System.out.println("Character: " + c + ", Integer: " + n);
	    }

	    public static void main(String[] args) {
	    	overloadingJava printer = new overloadingJava();
	        printer.printIntChar(42, 'A');
	        printer.printIntChar('B', 37);
	    }
	}
