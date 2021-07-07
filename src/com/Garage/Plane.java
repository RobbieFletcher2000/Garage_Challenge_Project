package com.Garage;

public class Plane extends Vehicle{
	
	private boolean canFly;
	
	public Plane(String vehicleType, String name, int numOfWheels, String vehicleColour, int numOfSeats, int vehicleID, boolean canFly) {
		super();
		this.setVehicleType(vehicleType);
		this.setVehicleName(name);
		this.setNumOfWheels(numOfWheels);
		this.setVehicleColour(vehicleColour);
		this.setNumOfSeats(numOfSeats);
		this.setVehicleID(vehicleID);
		this.canFly = canFly;
		
	}

}
