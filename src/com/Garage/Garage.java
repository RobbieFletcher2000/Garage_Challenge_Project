package com.Garage;

import java.util.ArrayList;




public class Garage {
	
private ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	
	public void addVehicle(Vehicle vehicles) {
		
		this.vehicles.add(vehicles);
		
	}
public void removeVehicle(Vehicle vehicles) {
		
		this.vehicles.remove(vehicles);
		
	}
	
	public void print() {
		
		System.out.println("Vehicles");
		for (Vehicle V : this.vehicles) {
			V.print();
			calculateTyreBill(V.getNumOfWheels());
		}
		
	}
	
	public void clearVehicles() {
		
		vehicles.clear();
		
	}
	
	public void removeByType() {
		for (Vehicle V : this.vehicles) {
			if (V.getVehicleType() == "Car"){
				removeVehicle(V);
			}
		}
	}
	
	public void calculateTyreBill(int numberOfTyres) {
		
		double carTyrePrice = 49.99;
		double bikeTyrePrice = 34.99;
		double planeTyrePrice = 100.00;
		
		if (numberOfTyres == 2) {
			
			double totalBill = bikeTyrePrice * numberOfTyres;
			System.out.println("Tyre Bill: £" + totalBill);
			
		}
		else if (numberOfTyres == 4) {
			
			
			double totalBill = carTyrePrice * numberOfTyres;
			System.out.println("Tyre Bill: £" + totalBill);
			
		}
		else if (numberOfTyres >= 6) {
			
			double totalBill = planeTyrePrice * numberOfTyres;
			System.out.println("Tyre Bill: £" + totalBill);
		}
			
		
		
		
		
		
		
	}
	

}
