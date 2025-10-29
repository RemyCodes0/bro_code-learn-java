import java.util.Random;
import java.util.Scanner;

public class NGG {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts=0;
        int randomNumber = random.nextInt(1,11);

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-10: ");

        do{
            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess< randomNumber){
                System.out.println("Too low, try again");
            }else if(guess> randomNumber){
                System.out.println("Too high try again");
            }else{
                System.out.println("Correct! the number was "+ randomNumber);
                System.out.println("Number of Attempts: " + attempts);
            }

            
        }while(guess != randomNumber);

        System.out.println("You have won");

    }
}
