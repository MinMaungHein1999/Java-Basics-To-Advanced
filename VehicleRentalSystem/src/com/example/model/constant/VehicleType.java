package com.example.model.constant;

public enum VehicleType {
	  CAR(1),
	  MOTORCYCLE(2);
	  
	  private int type;

	  VehicleType(int type) {
	    this.type = type;
	  }
	  public int getType() {
		  return type;
	  }
	  
	}