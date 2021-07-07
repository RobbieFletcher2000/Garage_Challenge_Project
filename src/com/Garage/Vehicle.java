package com.Garage;

public class Vehicle {
	
	
	private int numOfWheels;
	private String vehicleColour;
	private String vehicleName;
	private int numOfSeats;
	private int vehicleID;
	private String vehicleType;
	
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(String name, int numOfWheels, String vehicleColour, int numOfSeats, int vehicleID, String vehicleType) {
		super();
		this.setVehicleName(name);
		this.setVehicleColour(vehicleColour);
		this.setNumOfSeats(numOfSeats);
		this.setNumOfWheels(numOfWheels);
		this.setVehicleID(vehicleID);
		this.setVehicleType(vehicleType);
	
		
		
		
	}

	public void setVehicleName(String name) {
		
		this.vehicleName = name;
	}
	
    public void setVehicleColour(String vehicleColour) {
		
		this.vehicleColour = vehicleColour;
	}

    public void setNumOfSeats(int numOfSeats) {
	
	this.numOfSeats = numOfSeats;
    }

    public void setNumOfWheels(int numOfWheels) {
	
	this.numOfWheels = numOfWheels;
    }
    
    public void setVehicleID(int vehicleID) {
    	
    	this.vehicleID = vehicleID;
        }
    
    public void setVehicleType(String vehicleType) {
    	
    	
    	this.vehicleType = vehicleType;
    }
    
    public String getVehicleName() {
    	
    	return vehicleName;
   
    }
    
    public String getVehicleColour() {
    	
    	return vehicleColour;
    
    }
    
    public int getNumOfSeats() {
    	
    	return numOfSeats;
    }
    
    public int getNumOfWheels() {
    	
    	return numOfWheels;
    }
  public int getVehicleID() {
    	
    	return vehicleID;
    }
	public String getVehicleType() {
		
		return vehicleType;
	}
	
    public void print() {
    	
    	if (vehicleType == "Car") {
			Car manager = new Car();
			manager.print();
			
		}
    	else if (vehicleType == "Motorbike") {
    		Motorbike manager = new Motorbike();
    		manager.print();
    		
    	}
    	else if (vehicleType == "Plane") {
    		Plane manager = new Plane();
    		manager.print();
    		
    	}
    	else
    	
    	System.out.print("\nVEHICLE DOES NOT EXIST");
		
		
		
		
		
		
	}
	

}
