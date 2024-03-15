/* Write a program that display the area and perimeter of a circle
that has a radius of 5.5 using the following formula :

perimeter = 2 * pi(3.14) * radius
area = pi(3.14) * radius * radius
*/
package com.javacode.qspider_assignment.day10_Simple_Assignment;

class AreaPerimeterOfCircle {
	public static void main(String[] args){
		float radius = 5.5f;
		float pi = 3.14f;
		float circlePerimeter = 2 * pi * radius;
		float circleArea = pi * radius * radius;
		System.out.println("");
		System.out.println("The area of Circle of radius, " + radius + " cm is: " + circleArea + " cm^2");
		System.out.println("The perimeter of Circle of radius, " + radius + " cm is: " + circlePerimeter + " cm^2");
	}
}