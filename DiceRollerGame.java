import java.util.Random;
import java.util.Scanner;

public class DiceRollerGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Dice Roller Game!");
        System.out.println("Press Enter to roll the dice.");
        scanner.nextLine(); // Wait for user input

        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;

        System.out.println("You rolled: " + die1 + " and " + die2);
        System.out.println("Total: " + (die1 + die2));

        scanner.close();
    }
}