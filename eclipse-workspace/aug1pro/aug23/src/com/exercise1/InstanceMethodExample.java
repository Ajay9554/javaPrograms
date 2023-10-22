package com.exercise1;

public class InstanceMethodExample {

	public static void main(String[] args) {
		InstanceMethodExample obj = new InstanceMethodExample();
		System.out.println("the sum is:"+ obj.add(23,27));

	}
public int add(int a,int b) {
	int s = a+b;
	return s;
	
}
}
