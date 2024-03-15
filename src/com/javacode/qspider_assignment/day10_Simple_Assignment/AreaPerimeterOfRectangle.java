/*
Write a program to display the area and perimeter of a rectangle with the width of 4.5
and height of 7.9 using the following formula:

area = width * height
*/
package com.javacode.qspider_assignment.day10_Simple_Assignment;
class AreaPerimeterOfRectangle {
	public static void main(String[] args){
		float width = 4.5f;
		float height = 7.9f;
		float areaRectangle = width * height;
		float perimeterRectangle = 2 * ( width + height);
		System.out.println("The area of rectangle is " + areaRectangle + " cm^2");
		System.out.println("The perimeter of rectangle is " + perimeterRectangle + " cm");
	}
}