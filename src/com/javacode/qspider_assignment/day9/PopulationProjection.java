/*
Write a java program for population projection:

The Indian Census Bureau projects population based on the following assumptions:

1. One birth every & 7 seconds.
2. One death every 13 seconds.
3. One new immigrant every 45 seconds.

The program should display the population for each of the above, in next five years.
Assume the current population is 312,032,486 one year has 365 days.
*/
package com.javacode.qspider_assignment.day9;
class PopulationProjection
{
	public static void main(String[] args)
	{
		long currentPopulation = 312032486;
		long birthRateInYear = (365 * 24 * 60  * 60) / 7;
		long deathRateInYear = (365 * 24 * 60  * 60) / 13;
		long immigrantInYear = (365 * 24 * 60  * 60) / 45;
		System.out.println("Births takes place in 5 years: " + birthRateInYear * 5);
		System.out.println("Death occurs in 5 years: " + deathRateInYear * 5);
		System.out.println("Immigrant comes in 5 years: " + immigrantInYear * 5);
		long newPopulation = currentPopulation + (birthRateInYear - deathRateInYear + immigrantInYear)* 5;
		System.out.println("Now the new population after 5 years: " + newPopulation);
	}
}