package com.example.model;

public class Vehicle {
    public String ownerName,licenseNo;
    public String model;
    public double pricePerDay;
    public static int vehicleCount;
    public boolean isRental;
    
    public Vehicle(Vehicle vehicle) {
    	this.ownerName=vehicle.ownerName;
    	this.model=vehicle.model;
    	this.licenseNo=vehicle.licenseNo;
    	this.pricePerDay=vehicle.pricePerDay;
    	vehicleCount++;
    }
    
    public Vehicle() {
    	vehicleCount++;
    }
    public Vehicle(String ownerName,String model,String licenseNo,double pricePerDay) {
    	this.ownerName=ownerName;
    	this.model=model;
    	this.licenseNo=licenseNo;
    	this.pricePerDay=pricePerDay;
    	vehicleCount++;
    }
    public boolean equalLicenseNo(String licenseNo) {
    	return this.licenseNo.equalsIgnoreCase(licenseNo);
    }
}
