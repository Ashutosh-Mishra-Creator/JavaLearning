/* Write a program that reads a Celsius degree in a double value from the console, 
then converts it to Fahrenheit and display the result.

The formula for the conversion is as follows:
	Fahrenheit = (9/5)*celsius + 32

Hint: In Java 9/5 is 1, but 9.0/5 is 1.8.

Sample Output: Enter a degree in Celsius: 43
			   43 Celsius is 109.4 Fahrenheit
*/
package com.javacode.qspider_assignment.day10;
import java.util.Scanner;

class CelsiusToFahrenheit {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		double tempCelsius = scanner.nextDouble();
		double tempFahrenheit =  (9.0/5) * tempCelsius + 32;
		System.out.println(tempCelsius + " Celsius is " + tempFahrenheit + " Fahrenheit");
	}
}