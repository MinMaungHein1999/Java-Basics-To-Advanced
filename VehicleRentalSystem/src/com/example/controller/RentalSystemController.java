package com.example.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.model.Car;
import com.example.model.Motorcycle;
import com.example.model.Rental;
import com.example.model.Vehicle;
import com.example.model.constant.VehicleType;
import com.example.service.CarService;
import com.example.service.MotorcycleService;
import com.example.service.RentalService;
import com.example.service.VehicleService;

public class RentalSystemController {
	public static CarService carService = new CarService();
	public static VehicleService vehicleService = new VehicleService();
	public static MotorcycleService motorcycleService = new MotorcycleService();
	public static RentalService rentalService = new RentalService();
	
	public static Vehicle[] vehicles = new Vehicle[100];
	public static Rental[] rentals = new Rental[100];
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	public static void main(String[] args) throws IOException {
		int choice;
		do {

			System.out.println("Welcome From Car and Motorcycle Rental System");
			System.out.println("1. Add a Vehicle to the system");
			System.out.println("2. Rent Vehicle");
			System.out.println("3. Show Sale Report");
			System.out.println("4. Display Available Vehicle");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = Integer.parseInt(bufferedReader.readLine());

			switch (choice) {
			case 1 -> addVehicle();
			case 2 -> rentVehicle();
			case 3 -> showSalesReport();
			case 4 -> displayVehicles();
			case 5 -> System.out.println("Thank you for using the Car and Motorcycle Rental System. Goodbye!");
			default -> System.out.println("Invalid choice! Please select a valid option.");
			}

		} while (choice != 5);
		System.out.println();

	}

	public static void addVehicle() throws IOException {
		System.out.print("Enter vehicle type (car/motorcycle): ");
		String type = bufferedReader.readLine().toLowerCase();
		
		if (type.equals("car")) {
			carService.getCarInfo();
		} else if (type.equals("motorcycle")) {
			motorcycleService.getMortorCycleInfo();
		} else {
			System.out.println("Invalid vehicle type.");
		}
	}

	public static void rentVehicle() throws IOException {
		rentalService.rentVehicle();
	}

	public static void showSalesReport() {
		int rentedCars = 0;
		int rentedMotorcycles = 0;
		int availableCars = Car.carCount;
		int availableMotorcycles = Motorcycle.motorcycleCount;
		double carRevenue = 0;
		double bikeRevenue = 0;

		for (int i = 0; i < Rental.rentalCount; i++) {
			if (rentals[i] != null) {
				if (rentals[i].getVehicleType() == VehicleType.CAR) {
					rentedCars++;
					availableCars--;
					carRevenue += rentals[i].getTotalPrice();
				} else if (rentals[i].getVehicleType() == VehicleType.MOTORCYCLE) {
					rentedMotorcycles++;
					availableMotorcycles--;
					bikeRevenue += rentals[i].getTotalPrice();
				}
			}
		}
		System.out.println();
		System.out.println("Sale Report:");
		System.out.println("Motorcycles Rented: " + rentedMotorcycles);
		System.out.println("Motorcycles Remaining: " + availableMotorcycles);
		System.out.println("Cars Rented: " + rentedCars);
		System.out.println("Cars Remaining: " + availableCars);
		System.out.println("Revenue from Motorcycles: $" + bikeRevenue);
		System.out.println("Revenue from Cars: $" + carRevenue);
		System.out.println();
	}

	public static void displayVehicles() {
		System.out.println();
		System.out.println("Available Vehicles:");
		for (int i = 0; i < Vehicle.vehicleCount; i++) {
			if (vehicles[i] != null) {
				System.out.println("- " + vehicles[i].model + " (License No: " + vehicles[i].licenseNo + ", Price: $"
						+ vehicles[i].pricePerDay + "/day)");
			}
		}
		System.out.println();

	}

}
