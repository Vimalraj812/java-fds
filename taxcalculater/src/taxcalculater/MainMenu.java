package taxcalculater;  

import java.util.Scanner;

public class MainMenu {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
         {
            System.out.println("1. Add Property and Calculate Tax\n"
                    + "2. Add Vehicle and Calculate Tax\n"
                    + "3. Total Tax (Property + Vehicle)\n"
                    + "4. Exit");
            System.out.println("-----------------------------------------------");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    PropertyTax p1 = new PropertyTax();
                    p1.calculateTaxProperty();
                    break;
                case 2:
                    VehicleTax v1 = new VehicleTax();
                    v1.calculateVehicleTax();
                    break;
                case 3:
                    
                    System.out.println("Calculating total tax...");
                    vechile v2= new vechile();
                    v2.VehicleTaxdis();
                    break;
                case 4:
                    
                    System.out.println("Exiting the program.");
                    System.out.println("Thanks for using the app");
                    System.out.println("");
                    System.out.println("--------------------------------");
                    
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
