
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guesscount =0;
        int guess =0;
        while(guess!=numberDrawn){
            System.out.print("Guess a number:");
            guess =Integer.parseInt(reader.nextLine());
            if(guess<numberDrawn){
                System.out.println("The number is greater, guesses made:"+guesscount);
            }
            else{
                System.out.println("The number is lesser, guesses made:"+guesscount);
            }
            guesscount++;
        }
        System.out.println("Congratulations, your guess is correct!");

        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
