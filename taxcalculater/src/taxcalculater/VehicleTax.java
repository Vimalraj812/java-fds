package taxcalculater;  

import java.util.Scanner;

public class VehicleTax {  
    private double velocity;
    private double capacity;
    private double purchaseCost;

    public void calculateVehicleTax() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the vehicle type: ");
			System.out.println("1. Petrol");
			System.out.println("2. Diesel");
			System.out.println("3. LPG/CNG");
			System.out.print("Enter choice: ");

			int choice = scanner.nextInt();
			double tax = 0;

			switch (choice) {
			    case 1:
			        System.out.print("Enter velocity: ");
			        velocity = scanner.nextDouble();
			        System.out.print("Enter capacity: ");
			        capacity = scanner.nextDouble();
			        System.out.print("Enter purchase cost: ");
			        purchaseCost = scanner.nextDouble();
			        tax = velocity + capacity + (0.10 * purchaseCost);
			        System.out.println("Tax for Petrol-driven vehicles: " + tax);
			        System.out.println("-----------------------------------------------");
			        break;

			    case 2:
			        System.out.print("Enter velocity: ");
			        velocity = scanner.nextDouble();
			        System.out.print("Enter capacity: ");
			        capacity = scanner.nextDouble();
			        System.out.print("Enter purchase cost: ");
			        purchaseCost = scanner.nextDouble();
			        tax = velocity + capacity + (0.11 * purchaseCost);
			        System.out.println("Tax for Diesel vehicles: " + tax);
			        System.out.println("-----------------------------------------------");
			        break;

			    case 3:
			        System.out.print("Enter velocity: ");
			        velocity = scanner.nextDouble();
			        System.out.print("Enter capacity: ");
			        capacity = scanner.nextDouble();
			        System.out.print("Enter purchase cost: ");
			        purchaseCost = scanner.nextDouble();
			        tax = velocity + capacity + (0.12 * purchaseCost);
			        System.out.println("Tax for LPG/CNG vehicles: " + tax);
			        System.out.println("-------------------------------------------------");
			        break;

			    default:
			        System.out.println("Invalid choice. Please try again.");
			}

			//return tax;
		}
    }
}
