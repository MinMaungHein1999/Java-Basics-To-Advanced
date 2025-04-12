package com.example.model;

public class Motorcycle extends Vehicle {
    private double engineCapacity;
    public static int motorcycleCount;
    
    public Motorcycle(Vehicle vehicle, double engineCapacity) {
    	super(vehicle);
    	this.engineCapacity = engineCapacity;
    }
    
    public Motorcycle(String ownerName,String model,String licenseNo,double pricePerDay,double engineCapacity) {
  	  super(ownerName,model,licenseNo,pricePerDay);
  	  this.engineCapacity=engineCapacity;
  	  motorcycleCount++;
    }
    
    public double getEngineCapacity() {
  	  return engineCapacity;
    }
    public void setEngineCapacity(double engineCapacity) {
  	  this.engineCapacity=engineCapacity;
    }
}