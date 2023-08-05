package com.project.myapp;
import java.util.Scanner;

public class Calculator {
	
	Scanner scanner = new Scanner(System.in);
	
	public double add(double num01, double num02) {
		return num01 + num02;
	}
	
	public double sub(double num01, double num02) {
		return num01 - num02;
	}
	
	public double mult(double num01, double num02) {
		return num01 * num02;
	}
	
	public static double div(double num01, double num02) {
		if(num01 == 0 || num02 == 0) {
			System.out.println("You cannot divide by Zero");
			return 0.0;
		} else {
			return num01 / num02;
		}
	}
	
	public double rem(double num01, double num02) {
		return num01 % num02;
	}
	
}
