package com.project.myapp;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		IfChooseCalc chooseCalculator = new IfChooseCalc();
		IfChooseTemp chooseTemp = new IfChooseTemp();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("Select Application Type C for [Calculator] or T for [Temparature Converter] or X to [Exit]");
			System.out.print("Select C or T or X [Exit]: ");
			
			String userInput = scanner.nextLine().toLowerCase();

			if(userInput.equals("c")) {
				chooseCalculator.chooseCalc();
				break;
			} else if(userInput.equals("t")) {
				chooseTemp.chooseTemp();
				break;
			} else if(userInput.equals("x")) {
				System.out.println("Thank you for using our App, Program Exit");
				break;
			} else {
				System.out.println("Wrong Input");
			}
		}
		scanner.close();
	}
}
