import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallonsInTank;
        double fuelEfficiency;
        double pricePerGallon;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            gallonsInTank = scanner.nextDouble();
            if (gallonsInTank < 0) {
                System.out.println("Number of gallons cannot be negative.");
            }
        } while (gallonsInTank < 0);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            fuelEfficiency = scanner.nextDouble();
            if (fuelEfficiency <= 0) {
                System.out.println("Fuel efficiency must be greater than zero.");
            }
        } while (fuelEfficiency <= 0);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            pricePerGallon = scanner.nextDouble();
            if (pricePerGallon <= 0) {
                System.out.println("Price per gallon must be greater than zero.");
            }
        } while (pricePerGallon <= 0);

        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double maxDistance = gallonsInTank * fuelEfficiency;

        System.out.printf("The cost to drive 100 miles is: $%.2f\n", costPer100Miles);
        System.out.printf("The car can go %.2f miles with a full tank of gas.\n", maxDistance);

        scanner.close();
    }
}