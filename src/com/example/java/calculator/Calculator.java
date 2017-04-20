package com.example.java.calculator;

import java.util.Scanner;


public class Calculator {

	public int add(int num1, int num2){
		
		return num1+num2;
	}
	public int sub(int num1, int num2){
		return num1-num2;
	}
	public int mul(int num1, int num2){
		return num1*num2;
	}
	public float div(float num1, float num2){
		return num1/num2;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int num1, num2, result, choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for the Addition:");
		System.out.println("Enter 2 for the subtractio:");
		System.out.println("Enter 3 for the Multiplication:");
		System.out.println("Enter 4 for the division:");
		System.out.println("Enter 5 for Exit:");
		
		System.out.println("Enter Value for num1");
		num1 = sc.nextInt();
		System.out.println("Enter Value for num2");
		num2 = sc.nextInt();
		System.out.println("Enter Value for choice");
		choice = sc.nextInt();
		
		
		 if(choice == 1){
			 result = cal.add(num1, num2);
			 System.out.println("The sum value is: " + result);
		 }
		 else if(choice == 2){
			 result = cal.sub(num1, num2);
			 System.out.println("The sum value is: " + result);
		 }
		 else if(choice == 3){
			 result = cal.mul(num1, num2);
			 System.out.println("The sum value is: " + result);
		 }
		 else if(choice == 4){
			 float result1 = cal.div(num1, num2);
			 System.out.println("The sum value is: " + result1);
		 }
		 		else {
			 System.exit(0);
		 }
		 
		 
		 
		
	}

}
