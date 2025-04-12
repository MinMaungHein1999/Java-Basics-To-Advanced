package com.example.service;

import java.io.IOException;

import com.example.model.Motorcycle;
import com.example.model.Vehicle;

public class MotorcycleService extends VehicleService {
	
	public void getMortorCycleInfo() throws IOException {
		Vehicle vehicle = this.getVechicleInfo();
		System.out.print("Enter engine capacity: ");
		double cc = Double.parseDouble(bufferedReader.readLine());
		vehicles[Vehicle.vehicleCount] = new Motorcycle(vehicle, cc);
		System.out.println();
		System.out.println("Motorcycle added successfully!");
		System.out.println();
	}

	public Vehicle[] getMotorCycles() {
		return null;
	}
}
