// Write a java program to find the area of a circle, whose radius is 2.5 cm
package com.javacode.qspider_assignment.day9;

class AreaOfCircle
{
	public static void main(String[] args)
	{
		double radius = 2.5;
		final double pi = 22/7;
		double area = pi*(radius*radius);
		System.out.println("");
		System.out.println("Area of circle is: " + area + "cm^2, whose radius is " + radius + "cm");
	}
}
	