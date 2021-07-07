package com.Garage;

public class Car extends Vehicle {
	
	private int numOfDoors;
	
	public Car() {
		// Default constructor
	}
	
	public Car(String vehicleType, String name, int numOfWheels, String vehicleColour, int numOfSeats, int numOfDoors, int vehicleID) {
		super();
		this.setVehicleType(vehicleType);
		this.setVehicleName(name);
		this.setNumOfWheels(numOfWheels);
		this.setVehicleColour(vehicleColour);
		this.setNumOfSeats(numOfSeats);
		this.numOfDoors = numOfDoors;
		this.setVehicleID(vehicleID);
		
		
	}

}
