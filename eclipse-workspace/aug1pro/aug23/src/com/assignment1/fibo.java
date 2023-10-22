package com.assignment1;

import java.util.Scanner;

public class fibo {
public static void main(String[] args) {
	int a=0,b=1;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	System.out.println("fibonacci series:"+num);
	
	for(int i =1;i<=num;i++) {
		
		System.out.print(a+",");
		int fib=a+b;
		      a=b;
		      b=fib;
		
	}
	
}
}
