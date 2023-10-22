package com.exercise1;

import java.util.Scanner;

public class methodcreate {
public static int Length(String str) {
	int count=0;
	for(char c:str.toCharArray()) {
		if(c!=' ') {
		count++;
	}
	}
	return count;
}
public static void main(String[] args) {
	System.out.println("Enter the Paragraph to calculate length: ");
	Scanner myString = new Scanner(System.in);
	String mylength=myString.nextLine();
	int length= Length(mylength);
	System.out.println("Length of the string is:" +length);
}
}
