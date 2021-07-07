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
	
	public void print() {
		
		System.out.print("\nVehicle ID: ");
		System.out.println(this.getVehicleID());
		System.out.println("Vehicle Type: ");
		System.out.print(this.getVehicleType());
		System.out.print("\nVehicle Name: ");
		System.out.println(this.getVehicleName());
		System.out.print("Number of Seats: ");
		System.out.println(this.getNumOfSeats());
		System.out.print("Colour: ");
		System.out.println(this.getVehicleColour());
		System.out.print("Number of Wheels: ");
		System.out.println(this.getNumOfWheels());
		System.out.println("Number of Doors: ");
		System.out.println(this.numOfDoors);
		
		
	}

}
