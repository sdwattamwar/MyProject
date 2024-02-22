package com.assignment.my_assignment;
import java.util.Scanner;
public class Calculator {

	public int sum(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		return a/b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		int a,b;
		System.out.println("Enter Two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Sum of"+a+"and"+b+"is"+ calc.sum(a, b));
		System.out.println("Substarction of"+a+"and"+b+"is"+ calc.subtract(a, b));
		System.out.println("Multiplication of"+a+"and"+b+"is"+ calc.multiply(a, b));
		System.out.println("Division of"+a+"and"+b+"is"+ calc.divide(a, b));
		sc.close();

	}

}
