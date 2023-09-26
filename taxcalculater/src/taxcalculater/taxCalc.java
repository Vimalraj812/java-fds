package taxcalculater;  

import java.util.Scanner;

public class taxCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please login to continue....");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        {
        if (username.equals("vimal") && password.equals("12345")) {
            System.out.println("Login successful!");
            System.out.println("Welcome " +username );
            System.out.println("-----------------------------------------------");
            MainMenu m1 = new MainMenu();
            m1.menu();
            
        } else
        {
        	System.out.println("Login failed. Invalid username or password");
        	System.out.println("-----------------------------------------------");
        }
       }
        scanner.close();
    }
}

