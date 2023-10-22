package com.example2;

class Details {
	int id;
	String name;
	int age;

	Details(int i, String n) {
		id = i;
		name = n;
	}

	Details(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + "    " + name + "    " + age);
	}

}

public class Student {
	public static void main(String[] args) {
		System.out.println("ID====Name====Age");
		Details s1 = new Details(11, " Ajay", 23);
		Details s2 = new Details(22, "Sachin", 24);
		s1.display();
		s2.display();
	}
}
