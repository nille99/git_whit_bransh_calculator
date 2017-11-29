package com.example.maven.git_whit_bransh_calculator;

public class Calculator {
	public int add(int firstnumber, int seconnumber) {
		return firstnumber + seconnumber;
	}
	
	public int subtract(int firstnumber, int seconnumber) {
		return firstnumber - seconnumber;
	}
	public int mulitiply(int firstnumber, int seconnumber) {		
		return firstnumber * seconnumber;
	}
	public int divide(int firstNumber, int secondNumber) {
		int result = firstNumber / secondNumber;
		
		if(secondNumber == 0) {
			
			System.out.println("Division by zero?");
			return -1;
		}	
		
		return result;
	}
}
