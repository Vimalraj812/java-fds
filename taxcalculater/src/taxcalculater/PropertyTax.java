package taxcalculater;  

import java.util.Scanner;

public class PropertyTax {  

    public void calculateTaxProperty() {
        System.out.println("Is the property in the main city (Y/N):");

        try (Scanner scanner = new Scanner(System.in)) {
            String c = scanner.nextLine();
            if (c.equalsIgnoreCase("Y")) {
                System.out.print("Enter built-up area: ");
                double builtUpArea = scanner.nextDouble();
                System.out.print("Enter age factor: ");
                double ageFactor = scanner.nextDouble();
                System.out.print("Enter base value: ");
                double baseValue = scanner.nextDouble();

                double tax = (builtUpArea * ageFactor * baseValue) + (0.5 * builtUpArea);
                System.out.println("Tax for property in the main city: " + tax);
                System.out.println("----------------------------------------------------");
            } else if(c.equalsIgnoreCase("n")){
                System.out.println("Property is not in the main city.");
                
                System.out.print("Enter built-up area: ");
                double builtUpArea = scanner.nextDouble();
                System.out.print("Enter age factor: ");
                double ageFactor = scanner.nextDouble();
                System.out.print("Enter base value: ");
                double baseValue = scanner.nextDouble();

                double tax = (builtUpArea * ageFactor * baseValue);
                System.out.println("Tax for property not in main city: " + tax);
                System.out.println("------------------------------------------------------");
            }
        }
    }
}
