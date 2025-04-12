package com.example.model.constant;

public enum CarType {

	  LUXURY("luxury"),
	  CARRY("carry"),
	  TRIP_VAN("van");

	  private String type;

	  CarType(String type){
	    this.type = type;
	  }
	  public String getType() {
		  return type;
	  }
	  
	}