
// Guess the correct number 

import java.util.Scanner;
import java.util.Random;
public class whileLoop {
    public static void main(String args[]){
        Scanner getInput = new Scanner(System.in);
        Random random = new Random();

        int guess = 0;
        int attempts = 0;
        int numberToGuess = random.nextInt(100)+1;

        while(guess!=numberToGuess){

            System.out.println("Guess a number between 1 - 100 ");
            System.out.println("Enter your Guess:");
            guess=getInput.nextInt();

            if(guess>numberToGuess){
                System.out.println("Too High!");
            }
            else if(guess<numberToGuess){
                System.out.println("Too Low!");
            }
            else{
                System.out.println("Correct! You guessed it in " + attempts +" tries");
            }

            attempts++;
        }

        getInput.close();

    }
}
