package com.example.service;

import java.io.IOException;

import com.example.model.Car;
import com.example.model.Vehicle;
import com.example.model.constant.CarType;

public class CarService extends VehicleService{
	
	public void getCarInfo() throws IOException {
		
		Vehicle vehicle = this.getVechicleInfo();
		
		System.out.print("Enter number of seats: ");
		int seats = Integer.parseInt(bufferedReader.readLine());
		System.out.print("Enter type of car (luxury,carry,trip van): ");
		String ctype = bufferedReader.readLine().toUpperCase().replace(" ", "_");
		CarType carType = CarType.valueOf(ctype);
		vehicles[Vehicle.vehicleCount] = new Car(vehicle, seats, carType);
		System.out.println();
		System.out.println("Car added successfully!");
		System.out.println();
		
	}
	
	public Vehicle[] getCars() {
		Vehicle[] cars=new Vehicle[Car.carCount];
		int currentIndex = 0;
		for(int i=0; i<= Vehicle.vehicleCount; i++) {
			if(vehicles[i] instanceof Car ) {
				cars[currentIndex] = vehicles[i];
				currentIndex++;
			}
		}
		if(currentIndex >= 0) {
			return cars;
		}else {
			return null;
		}
		
	}

}
