import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = getValidCelsiusInput(scanner);
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("The equivalent tempurature in Fahrenheit is: %.2f F%n", fahrenheit);
    }

private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
}

private static double getValidCelsiusInput(Scanner scanner) {
        while (true) {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Enter a number");
                scanner.next();
            }
        }
}
    }

