package com.ExceptionHandling;

public class FinalCheck {
    //declaring final variable  
    final int age = 18;  
    void display() {  
      
    // reassigning value to age variable   
    // gives compile time error  
//    age = 55;  
    System.out.println(age);
    }  
      
    public static void main(String[] args) {  
      
   FinalCheck obj = new FinalCheck();  
    // gives compile time error  
    obj.display();  
    }  
}  