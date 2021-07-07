package com.Garage;

import java.util.ArrayList;




public class Garage {
	
private ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	
	public void addVehicle(Vehicle vehicles) {
		
		this.vehicles.add(vehicles);
		
	}
	
	public void print() {
		
		System.out.println("Vehicles");
		for (Vehicle V : this.vehicles) {
			V.print();
		}
		
	}
	

}
