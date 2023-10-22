package com.assignment1;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		int fact =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int input=sc.nextInt();
	 for(int i=1;i<=input;i++) {
		fact *=i;
		
	}
	System.out.println("factorial of"+input +" is: "+ fact);
	}

}
