package com.GetSetData;

public class GetSetConstructor {
	 private int id ;
	   private String name;
	   private String department;
	   
	public GetSetConstructor(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
	  public static void main(String[] args) {
		GetSetConstructor cons = new GetSetConstructor(101, "Shivam", "ullu");
		System.out.println("details: \n"+"\t Your id: "+cons.id+ "\t Your Nmae: "+cons.name+"\t Your Department: "+cons.department);;
	}
}
