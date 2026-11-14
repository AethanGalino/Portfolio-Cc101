
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber;
        int guess;
        int attempts;
        String playAgain;

        System.out.println("==============================");
        System.out.println("     NUMBER GUESSING GAME");
        System.out.println("==============================");

        do {
            // Generate random number from 1 to 100
            secretNumber = random.nextInt(100) + 1;

            attempts = 0;

            System.out.println("\nGuess the number from 1 to 100!");

            // Loop until the player guesses correctly
            do {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();

                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Correct! You won!");
                }

            } while (guess != secretNumber);

            // Display game result
            System.out.println("\n==============================");
            System.out.println("          GAME RESULT");
            System.out.println("==============================");

            System.out.println("Secret Number: " + secretNumber);
            System.out.println("Total Attempts: " + attempts);

            System.out.print("\nPlay again? (Y/N): ");
            playAgain = input.next();

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("\nThank you for playing!");

        input.close();
    }
}
