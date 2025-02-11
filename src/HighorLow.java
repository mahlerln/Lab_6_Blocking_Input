import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
    Random random = new Random();
    int randomNumber = random.nextInt(10) + 1;
    int userGuess;
    Scanner scanner = new Scanner(System.in);


    do {
        System.out.print("Guess a number between 1 and 10: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Enter a number 1-10.");
            scanner.next();
        }
        userGuess = scanner.nextInt();
    } while (userGuess < 1 || userGuess > 10);

    System.out.println("The random number was: " + randomNumber);

    if (userGuess == randomNumber) {
        System.out.println("On the money!");
    } else if (userGuess < randomNumber) {
        System.out.println("Low!");
    } else {
        System.out.println("High!");
    }
    scanner.close();



    }
}
