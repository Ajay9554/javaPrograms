package com.CollectionWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		 ArrayList<String> al =new ArrayList<>();
		 al.add("Java");
		 al.add("C");
		 al.add("C++");
		 al.add("php");
		 al.add("python");
		 al.add("CSS");
		 al.add("html");
		 al.add(1,"Android");
		 System.out.println("ArrayList: "+al);
		 System.out.println("=============================");
		 
		 al.remove("php");
		 System.out.println("Size of ArrayList after removing php : "+al.size() );
		 System.out.println("============================");
		 
		 System.out.println("Is java is in list: " +al.contains("Java"));
		
		 System.out.println("I want: " + al.get(0));
		 System.out.println("==========================");
		 
		 Object[] a =al.toArray();
		 
		 System.out.println("Array");
		 for(Object object : a) {
			 System.out.println(object+ " ");
		 }
		 
		 al.set(6,"JavaScript");
		 System.out.println("ArrayList after replace: " + al);
		 System.out.println("============================");
		 
		 Collections.sort(al);
		 System.out.println("ArrayList after sort: "+ al);
		 System.out.println("===============================");
		 System.out.println("Index of Android: "+al.indexOf("Android"));
		 
		 al.clear();
		 System.out.println(al+" "+ "list is Empty after clear: "+al.isEmpty());		 
		 
	}

}
