package com.example.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.model.Rental;
import com.example.model.Vehicle;
import com.example.model.constant.VehicleType;

public class RentalService {
	public static Rental[] rentals = new Rental[100];
	public static VehicleService vehicleService = new VehicleService();
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	
	public void rentVehicle() throws IOException {
		System.out.print("Enter vehicle type (car/motorcycle): ");
		String type = bufferedReader.readLine().toLowerCase();

		VehicleType vehicleType;
		if (type.equals("car")) {
			vehicleType = VehicleType.CAR;
		} else if (type.equals("motorcycle")) {
			vehicleType = VehicleType.MOTORCYCLE;
		} else {
			System.out.println("Invalid type.");
			return;
		}

		System.out.print("Enter license number: ");
		String license = bufferedReader.readLine();
		System.out.print("Enter number of days to rent: ");
		int days = Integer.parseInt(bufferedReader.readLine());

		Vehicle vehicle = vehicleService.findByLicense(license);
		if(vehicle != null) {
			if(!vehicle.isRental) {
				Rental rental = new Rental(Rental.rentalCount++, vehicleType, vehicle, days);
				rentals[Rental.rentalCount] = rental;
				vehicle.isRental = true;
				System.out.println();
				System.out.println("Vehicle rented successfully! Total price: $" + rental.getTotalPrice());
				System.out.println();
			}else {
				System.out.print("Vehicle is already Rental : "+ vehicle);
			}
			
		}else {
			System.out.print("Vehicle License Not Found for the : "+ license);
		}
		

	}


}
