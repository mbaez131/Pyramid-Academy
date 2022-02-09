import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class guessNum {
    public static String getName(String name) {
        return name;
    }

    public static int getInt() {
        Random ran = new Random();
        int num = ran.nextInt((20 - 1) + 1);
        return num;
    }

    public static void strOutput() {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int guess;
        for (int i = 0; i < 6; i++) {
            counter++;
            guess = sc.nextInt();
            if (getInt() == guess) {
                System.out.println("Good job, " + getName(sc.nextLine()) + "! You guessed my number in " + counter + " guesses!");
                break;
            } else if (getInt() > guess) {
                System.out.println("Your guess is too low.");
                System.out.println("Take a guess.");
            } else if (guess > getInt()) {
                System.out.println("Your guess is too high.");
                System.out.println("Take a guess.");
            } else if(counter == 6) {
                System.out.println("You have run out of guesses. GAME OVER.");
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! What is your name? : ");
        try {
        System.out.println("Well, " + getName(sc.nextLine()) + ", I am thinking of a number between 1 and 20. Take a guess");
        strOutput();
        } catch(InputMismatchException e){
            System.out.println("Input is of incorrect type.");
        }
    }
}
