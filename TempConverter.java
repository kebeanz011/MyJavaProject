package com.project.myapp;

public class TempConverter {
	
	public double celToFah (double celcius) {
		return (celcius * 9/5) + 32;
	}
	
	public double celToKel (double celcius) {
		return celcius + 273.15;
	}
	
	public double fahToCel (double fahrenheit) {
		return (fahrenheit - 32) * 5/9;
	}
	
	public double fahToKel (double fahrenheit) {
		return (fahrenheit + 459.67) * 5/9;
	}
	
	public double kelToCel (double kelvin) {
		return kelvin - 273.15;
	}
	
	public double kelToFah (double kelvin) {
		return (kelvin * 9/5) - 459.67;
	}

}
