import java.util.Random;
import java.util.*;
import java.util.Scanner;
public class GuessGame
{
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    int score = 0;
    String play = "yes";
    System.out.println("=== Number Guessing Game ===");
    while (play.equalsIgnoreCase("yes"))
    {
        int secretNumber = rand.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 5;
        boolean isGuessed = false;
        System.out.println("\nGuess a number between 1 and 100");
        System.out.println("You have only " + maxAttempts + " tries.");
        while (attempts < maxAttempts)
        {
            System.out.print("Enter your guess: ");
            int userGuess = in.nextInt();
            attempts++;
            int diff = Math.abs(secretNumber - userGuess);
            if (userGuess == secretNumber)
            {
                System.out.println("Correct! You guessed the number 🎉");
                score += 10;
                isGuessed = true;
                break;
            } 
            else if (diff <= 5)
            {
                System.out.println("Very close! Keep trying ");
            } 
            else if (userGuess > secretNumber)
            {
                System.out.println("Too high! Try again");
            } 
            else
            {
                System.out.println("Too low! Try again");
            }

                System.out.println("Remaining attempts: " + (maxAttempts - attempts));
            }

            if (!isGuessed)
            {
                System.out.println("You couldn't guess it ");
                System.out.println("The correct number was: " + secretNumber);
            }
            System.out.println("Your score: " + score);
            System.out.print("\nDo you want to play again? (yes/no): ");
            play = in.next();
        }
        System.out.println("\nFinal Score: " + score);
        System.out.println("Thank you for playing!");
    }
}