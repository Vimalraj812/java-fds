package taxcalculater;

import java.util.ArrayList;
import java.util.Scanner;

class Vehicle {
    String type;
    double velocity;
    int capacity;
    double cost;

    public Vehicle(String type, double velocity, int capacity, double cost) {
        this.type = type;
        this.velocity = velocity;
        this.capacity = capacity;
        this.cost = cost;
    }
}

public class vechile {

    public void VehicleTaxdis() {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Double> baseValues = new ArrayList<>();
            ArrayList<Double> purchaseCosts = new ArrayList<>();
            ArrayList<Double> builtUparea = new ArrayList<>();
            ArrayList<String> incitys = new ArrayList<>();
            ArrayList<Vehicle> vehicles = new ArrayList<>();

            // Collect data for properties
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter base value for property " + (i + 1) + ": ");
                double baseValue = scanner.nextDouble();
                baseValues.add(baseValue);

                System.out.println("Enter purchase cost for property " + (i + 1) + ": ");
                double purchaseCost = scanner.nextDouble();
                purchaseCosts.add(purchaseCost);

                System.out.println("Enter built-up area for property " + (i + 1) + ": ");
                double builtUpCost = scanner.nextDouble();
                builtUparea.add(builtUpCost);

                System.out.println("Enter incity or not (Y/N) for property " + (i + 1) + ": ");
                String incity = scanner.next();
                incitys.add(incity);
            }

            for (int i = 0; i < 2; i++) {
                System.out.println("Enter vehicle type for vehicle " + (i + 1) + ": ");
                String type = scanner.next();

                System.out.println("Enter velocity for vehicle " + (i + 1) + ": ");
                double velocity = scanner.nextDouble();

                System.out.println("Enter capacity for vehicle " + (i + 1) + ": ");
                int capacity = scanner.nextInt();

                System.out.println("Enter cost for vehicle " + (i + 1) + ": ");
                double cost = scanner.nextDouble();

                vehicles.add(new Vehicle(type, velocity, capacity, cost));
            }

            
            System.out.println("======================================================================");
            System.out.println("Base Values\tPurchase Costs\tBuilt-Up area\tIncity");
            System.out.println("======================================================================");
            for (int i = 0; i < 3; i++) {
                System.out.println(" " + baseValues.get(i) + "\t\t" + purchaseCosts.get(i) + "\t\t" +
                        builtUparea.get(i) + "\t\t" + incitys.get(i));
            }
            System.out.println("======================================================================");

            System.out.println("");
            
            System.out.println("======================================================================");
            System.out.println("Vehicle Type\tVelocity\tCapacity\tCost");
            System.out.println("======================================================================");
            for (Vehicle vehicle : vehicles) {
                System.out.println("  " + vehicle.type + "\t\t" + vehicle.velocity + "\t\t" +
                        vehicle.capacity + "\t\t" + vehicle.cost);
            }
            System.out.println("======================================================================");
        }
    }

}
