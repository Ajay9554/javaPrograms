package com.CollectionWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class AllMethodOfArrayList {
	public static void main(String[] args) {
		System.out.println("ArrayList all methods use in :");
		System.out.println("1: add and addAll ");
		System.out.println("2: remove and removeAll");
		System.out.println("3: Traversing list through Iterator and For-each loop ");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of you want to perform the task");
		int n =sc.nextInt();
		switch(n) {
		case 1:
		  ArrayList<String> al =new ArrayList<>();
		    al.add("Ajay");
		    al.add("Vijay");
		    al.add("Vinay");
		    al.add("Sajay");
		    al.add("Sachin");
		    al.add("Akash");
		    System.out.println("===============simple Adding element============");
		    System.out.println(al);
		    System.out.println("======================================");
		  ArrayList<String>al1 =new ArrayList<String>();
			al1.add(null);
			al1.add(0,"Ram");
			al1.add(1,"Shyam");
			al1.add(2,"Krishna");
			System.out.println("===============Adding New element============");
			System.out.println(al1);
			al.addAll(al1);
			System.out.println("=============After Adding new element=======");
			System.out.println(al);
		break;
		case 2:
			  ArrayList<String> al2 =new ArrayList<>();
			    al2.add("Ajay");
			    al2.add("Vijay");
			    al2.add("Vinay");
			    al2.add("Sajay");
			    al2.add("Sachin");
			    al2.add("Akash");
			    System.out.println("===============simple Adding element============");
			    System.out.println(al2+"\t Total element is: "+al2.size());
			    
			   
			     al2.remove("Akash");
			     al2.remove(3);
				System.out.println("=============After remove one element========");
				System.out.println(al2);
				System.out.println("=============After remove the all element=========");
				al2.removeAll(al2);
				 
		break;
		case 3:
		  ArrayList<String> al3 =new ArrayList<>();
		    al3.add("Ajay");
		    al3.add("Vijay");
		    al3.add("Vinay");
		    al3.add("Sajay");
		    al3.add("Sachin");
		    al3.add("Akash");
		    System.out.println("===============simple Adding element============");
		    System.out.println(al3);
		    
		    System.out.println("================After Itrate======================");
		    Iterator<String> itr =al3.iterator();
		    while(itr.hasNext()) {
		    	System.out.println(itr.next());
		    }
		    System.out.println("=============After using ListIterator===============");
		    ListIterator<String> li=al3.listIterator(al3.size());  
            while(li.hasPrevious())  
            {  
                String str=li.previous();  
                System.out.println(str);  
            }  
		    
		    
		break;
		case 4:
		   ArrayList<String> al4 =new ArrayList<>();
	         al4.add("Ajay");
	         al4.add("Vijay");
	         al4.add("Vinay");
	         al4.add("Sajay");
	         al4.add("Sachin");
	         al4.add("Akash");
	    System.out.println("===============simple Adding element============");
	    System.out.println(al4);
	    System.out.println("===============Using for-each loop ============");
	    for(String name:al4) {
	    	System.out.println(name);
	    
	    }
	    
	    break;
		  
			
		default:
			System.out.println("Invalid number  you enter the correct number from 1-2");
			 
		    }
		    
		    
		    
		    
		    
		
		}
}
