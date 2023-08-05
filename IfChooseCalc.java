package com.project.myapp;
import java.util.Scanner;

public class IfChooseCalc {
	
	public void chooseCalc() {
		
		Calculator calc = new Calculator();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("Choose Operation [ADD | SUB | MULT | DIV] or X to [EXIT]: ");
			String userInputC = scanner.nextLine().toLowerCase();
		
			if(userInputC.equals("add") || userInputC.equals("sub") || userInputC.equals("mult") || userInputC.equals("div")) {
			
				System.out.print("Enter first value: ");
				double num01 = scanner.nextDouble();
				
				System.out.print("Enter second value: ");
				double num02 = scanner.nextDouble();
				
				scanner.nextLine();
			
				if(userInputC.equals("add")) {
					double result = calc.add(num01, num02);
					System.out.println(num01 + " + " + num02 + " = " + result);
				} else if(userInputC.equals("sub")) {
					double result = calc.sub(num01, num02);
					System.out.println(num01 + " - " + num02 + " = " + result);
				} else if(userInputC.equals("mult")) {
					double result = calc.mult(num01, num02);
					System.out.println(num01 + " x " + num02 + " = " + result);
				} else if(userInputC.equals("div")) {
					double result = Calculator.div(num01, num02);
					double remainder = calc.rem(num01, num02);
					System.out.println(num01 + " / " + num02 + " = " + result);
					System.out.println("Remainder: " + remainder);
				} else {
					System.out.println("Wrong Input!");
				}
			} else if(userInputC.equals("x")) {
				System.out.println("Thank you for using our App, Exit Calculator App");
				break; 
			}
		}
		scanner.close();
	}
}
