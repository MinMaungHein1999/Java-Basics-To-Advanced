package com.example.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.example.model.Vehicle;

public class VehicleService {
	public static CarService carService = new CarService();
	public static MotorcycleService motorcycleService = new MotorcycleService();
	public static Vehicle[] vehicles = new Vehicle[100];
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	
	public Vehicle getVechicleInfo() throws IOException {
		System.out.print("Enter owner name: ");
		String owner = bufferedReader.readLine();
		System.out.print("Enter model: ");
		String model = bufferedReader.readLine();
		System.out.print("Enter license number: ");
		String license = bufferedReader.readLine();
		System.out.print("Enter price per day: ");
		double price = Double.parseDouble(bufferedReader.readLine());
		Vehicle vehicle = new Vehicle(owner, model, license, price);
		return vehicle;
	}
	
	public Vehicle findByLicense(String license) {
		for (int i = 0; i < Vehicle.vehicleCount; i++) {
			if (vehicles[i].equalLicenseNo(license)) {
				return vehicles[i];
			}
		}
		return null;
	}
	
	public static void displayAllAvailableVehicles() {
		System.out.println();
		System.out.println("Available Vehicles:");
		Vehicle[] cars = carService.getCars();
		Vehicle[] motorCycles = motorcycleService.getMotorCycles();
		
		displayVehicleArr(cars);
		displayVehicleArr(motorCycles);
		
		System.out.println();
	}
	
	private static void displayVehicleArr(Vehicle[] vehiclesArr) {
		for (int i = 0; i < Vehicle.vehicleCount; i++) {
			if (vehiclesArr[i] != null && !vehiclesArr[i].isRental) {
				System.out.println("- " + vehiclesArr[i].model + " (License No: " + vehiclesArr[i].licenseNo + ", Price: $"
						+ vehiclesArr[i].pricePerDay + "/day)");
			}
		}
		System.out.println();
	}
	

}
