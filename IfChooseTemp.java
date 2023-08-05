package com.project.myapp;
import java.util.Scanner;

public class IfChooseTemp {
	
	public void chooseTemp() {
		
		TempConverter tempConv = new TempConverter();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("Choose what to convert, From [C = Celcius, F = Fahrenheit, K = Kelvin], X to [EXIT]: ");
			String fromConv = scanner.nextLine().toLowerCase();
			
			if(fromConv.equals("c") || fromConv.equals("f") || fromConv.equals("k")) {
				
				System.out.print("To what temparature?. To [C = Celcius, F = Fahrenheit, K = Kelvin] : ");
				String toConv = scanner.nextLine().toLowerCase();
			
				if(fromConv.equals("c") && toConv.equals("f")) {
					System.out.print("Enter Value: ");
					double celcius = scanner.nextDouble();
					double result = tempConv.celToFah(celcius);
					System.out.println(celcius + " Degree Celcius, Convert to Fahrenheit is: " + result + " Fahrenheit");
				} else if(fromConv.equals("c") && toConv.equals("k")) {
					System.out.print("Enter Value: ");
					double celcius = scanner.nextDouble();
					double result = tempConv.celToFah(celcius);
					System.out.println(celcius + " Degree Celcius, Convert to Kelvin is: " + result + " Kelvin");
				} else if(fromConv.equals("f") && toConv.equals("c")) {
					System.out.print("Enter Value: ");
					double fahrenheit = scanner.nextDouble();
					double result = tempConv.fahToCel(fahrenheit);
					System.out.println(fahrenheit + " Fahrenheit, Convert to Degree Celcius is: " + result + " Degree Celcius");
				} else if(fromConv.equals("f") && toConv.equals("k")) {
					System.out.print("Enter Value: ");
					double fahrenheit = scanner.nextDouble();
					double result = tempConv.fahToKel(fahrenheit);
					System.out.println(fahrenheit + " Fahrenheit, Convert to Kelvin is: " + result + " Kelvin");
				} else if(fromConv.equals("k") && toConv.equals("c")) {
					System.out.print("Enter Value: ");
					double kelvin = scanner.nextDouble();
					double result = tempConv.kelToCel(kelvin);
					System.out.println(kelvin + " Kelvin, Convert to Degree Celcius is: " + result + " Degree Celcius");
				} else if(fromConv.equals("k") && toConv.equals("f")) {
					System.out.print("Enter Value: ");
					double kelvin = scanner.nextDouble();
					double result = tempConv.kelToFah(kelvin);
					System.out.println(kelvin + " Kelvin, Convert to Fahrenheit is: " + result + " Fahrenheit");
				} else {
					System.out.println("Wrong Input");
				}
			} else if(fromConv.equals("x")) {
				System.out.println("Thank you for using our App, Exit Temparature Converter App");
				break;
			}
			
		}
		scanner.close();
	}

}
