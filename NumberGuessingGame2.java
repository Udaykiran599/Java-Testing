import java.util.Scanner;

public class NumberGuessingGame2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secretNumber = 7;
        int guessingNumber;

        System.out.println("Guess the number between 1 and 10:");

        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Enter a number.");
                sc.next(); // discard invalid input
                continue;
            }

            guessingNumber = sc.nextInt();

            if (guessingNumber < secretNumber) {
                System.out.println("Too low. Try again:");
            } else if (guessingNumber > secretNumber) {
                System.out.println("Too high. Try again:");
            } else {
                System.out.println("Correct guess!");
                break;
            }
        }

        sc.close();
    }
}
