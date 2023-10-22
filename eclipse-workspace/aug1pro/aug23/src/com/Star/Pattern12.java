package com.Star;

public class Pattern12 {
	public static void main(String[] args) {
		int a=1;
		for(int i=1;i<=5;i++) {
			       int x=a;
					for(int j=1;j<=i;j++) {
						
           System.out.print(x+" ");
           x+=5;
			}
					a++;
			System.out.println();
		}
	}

}
