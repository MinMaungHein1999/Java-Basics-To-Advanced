package com.example.model;

import com.example.model.constant.VehicleType;

public class Rental {
      private int rentalId,rentedDays;
      private VehicleType vehicleType;
      private double totalPrice;
      private Vehicle vehicle;
      public static int rentalCount;
      
      public Rental(int rentalId,VehicleType vehicleType, Vehicle vehicle,int rentedDays,double totalPrice) {
    	  this.rentalId=rentalId;
    	  this.vehicleType=vehicleType;
    	  this.vehicle=vehicle;
    	  this.rentedDays=rentedDays;
    	  this.totalPrice=totalPrice;
    	  rentalCount++; 
      }
      
      public Rental(int rentalId,VehicleType vehicleType,Vehicle vehicle,int rentedDays) {
    	  this.rentalId=rentalId;
    	  this.vehicleType=vehicleType;
    	  this.vehicle=vehicle;
    	  this.rentedDays=rentedDays;
    	  this.totalPrice = this.calculateTotallPrice();
    	  rentalCount++; 
      }
      
     
      private double calculateTotallPrice() {
		return this.rentedDays * this.vehicle.pricePerDay;
	}

	public int getRentalId() {
    	  return rentalId;
      }
      public VehicleType getVehicleType() {
    	  return vehicleType;
      }
      public Vehicle getVehicle() {
    	  return vehicle;
      }
      public int getRentedDays() {
    	  return rentedDays;
      }
      public double getTotalPrice() {
    	  return totalPrice;
      }
      public void setRentalId(int rentalId) {
    	  this.rentalId=rentalId;
      }
      public void setVehicleType(VehicleType vehicleType) {
    	  this.vehicleType=vehicleType;
      }
      public void setVehicle(Vehicle vehicle) {
    	  this.vehicle=vehicle;
      }
      public void setTotalPrice(double totalPrice) {
    	  this.totalPrice=totalPrice;
      }
      public void setRentedDays(int rentedDays) {
    	  this.rentedDays=rentedDays;
      }

}
