import java.util.Random;
import java.util.Scanner;

public class guessNum {
    public static void main(String[] args) {
        Random ran = new Random();
        int counter = 0;
        int guess;
        int ranNum = ran.nextInt((20 - 1) + 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! What is your name? : ");
        String name = sc.nextLine();
        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20. Take a guess");

        for(int i = 0; i < 6;i++) {
            counter++;
            guess = sc.nextInt();
            if(ranNum == guess) {
                System.out.println("Good job, " + name + "! You guessed my number in " + counter + " guesses!");
                break;
            }
            else if(ranNum > guess) {
                System.out.println("Your guess is too low.");
                System.out.println("Take a guess.");
            }
            else if(guess > ranNum) {
                System.out.println("Your guess is too high.");
                System.out.println("Take a guess.");
            }
        }

    }
}
