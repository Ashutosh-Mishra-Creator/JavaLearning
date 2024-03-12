package com.javacode.qspider_assignment.day7;

class CombinedVidaV1Pro
{
	public static void main(String[] args)
	{
		String name = new String("Hero Vida V1 Pro");

		byte mileage = 110;
		short motorPeakPower = 6000;
		int vehicleWarranty = 50000;
		long noOfEvs = 26000000;
		float installedBatteryCapacity = 3.94f;
		double electricityConsumption = 25500000000000000D;
		char rating = 'A';
 		boolean electric = true;

		System.out.println("Name of the Vehicle: " + name);
		System.out.println("Mileage of " + name + " : " + mileage + "km");
		System.out.println("Peak motor power of " + name + " is " + motorPeakPower + "W");
		System.out.println("Vehicle Warranty of " + name + " : " + vehicleWarranty + "km");
		System.out.println("Installed Battery Capacity :" + installedBatteryCapacity + "kWh");
		System.out.println("Rating : " + rating + "+");
		System.out.println("Is it electric :" + electric);
		System.out.println("Total no of electric car on road in 2022 were " + noOfEvs);
		System.out.println("In 2022, the world consumed about " + electricityConsumption + " watt-hours or 25500 (TWh) of electricity," +
				" which is more than three times the amount consumed in 1980.");
	}
}