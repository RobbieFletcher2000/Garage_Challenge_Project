package com.Garage;

public class Motorbike extends Vehicle{

	private boolean sidecar;
	
	
	public Motorbike() {
		// Default constructor
	}
	
	public Motorbike(String vehicleType, String name, int numOfWheels, String vehicleColour, int numOfSeats, int vehicleID, boolean sidecar) {
		super();
		this.setVehicleType(vehicleType);
		this.setVehicleName(name);
		this.setNumOfWheels(numOfWheels);
		this.setVehicleColour(vehicleColour);
		this.setNumOfSeats(numOfSeats);
		this.setVehicleID(vehicleID);
		this.sidecar = sidecar;
		
		
	}
	
	
}
