package com.Garage;

public class App_main {
	
	public static void main(String[] args) {
		Vehicle Car1 = new Car("Car", "Ford", 4, "Grey", 5, 5, 1);
		Vehicle Bike1 = new Motorbike("Motorbike","Yamaha", 2, "Black", 2, 2, false);
		Vehicle Plane1 = new Plane("Plane","Boeing", 6, "White", 120, 3, true);
		Vehicle Plane2 = new Plane("Plane","Boeing 2", 6, "White", 140, 4, true);
		Garage garage = new Garage();
		
		garage.addVehicle(Car1);
		garage.addVehicle(Bike1);
		garage.addVehicle(Plane1);
		garage.addVehicle(Plane2);
		
		garage.removeVehicle(Plane1);
		
		
		
		
		garage.print();
		garage.removeByType(); // Doesn't currently work - will fix
		
		//garage.clearVehicles();
// clear all vehicles in garage ^		
		garage.print();
	}

}
