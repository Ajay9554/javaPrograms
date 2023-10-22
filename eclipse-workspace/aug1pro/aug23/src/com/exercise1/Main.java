package com.exercise1;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("Salary:          " + salary);
    }
}

class Employee extends Member {
    String specialization;

    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;

    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Alam Employee", 25, "123-456-7890", "456 Elm St, City", 60000, "Software Development");
        Manager manager = new Manager("Sartaj Manager", 35, "987-654-3210",   "789 Oak St, City", 80000, "Operations");

        System.out.println("=========== Employee Details: ============");
        System.out.println("Name:            " + employee.name);
        System.out.println("Age:             " + employee.age);
        System.out.println("Phone Number:    " + employee.phoneNumber);
        System.out.println("Address:         " + employee.address);
        employee.printSalary();
        System.out.println("Specialization:  " + employee.specialization);

        System.out.println("\n===========Manager Details:=============");
        System.out.println("Name:            " + manager.name);
        System.out.println("Age:             " + manager.age);
        System.out.println("Phone Number:    " + manager.phoneNumber);
        System.out.println("Address:         " + manager.address);
        manager.printSalary();
        System.out.println("Department:      " + manager.department);
    }
}
