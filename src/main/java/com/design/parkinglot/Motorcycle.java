package com.design.parkinglot;

// Vehicle and its inherited classes.

public class Motorcycle extends Vehicle {
	public Motorcycle() {
		spotsNeeded = 1;
		size = VehicleSize.Motorcycle;
	}

	public boolean canFitinSpot(ParkingSpot spot) {
		return true;
	}
}