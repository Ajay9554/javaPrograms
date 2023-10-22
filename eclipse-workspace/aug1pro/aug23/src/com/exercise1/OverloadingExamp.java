package com.exercise1;
class A{
static int First (int a,int b)
    {return a+b;}
static int First (int a,int b, int c)
    {return a+b+c;}
}
public class OverloadingExamp {
public static void main(String[] args) {
	System.out.println(A.First(1,3));
	System.out.println(A.First(3,4,5));

}
}
