import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width, height;

        do {
            System.out.print("Enter the width of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("invalid input. Please enter a number.");
                scanner.next();
            }
            width = scanner.nextDouble();
        } while (width <= 0);


        do {
            System.out.print("Enter the height of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("invalid input. Please enter a number.");
                scanner.next();
            }
            height = scanner.nextDouble();
        } while (height <= 0);


        double area = width * height;
        double perimeter = 2 * (width * height);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));


        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}
