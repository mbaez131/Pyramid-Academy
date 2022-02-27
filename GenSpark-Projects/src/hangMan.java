
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class hangMan {
    public String word;
    ArrayList<String> missedLetters;
    boolean playing;

    void begin() {
        String answer = wordPrint(word.length());
        playing = true;
        Scanner sc = new Scanner(System.in);
        while(playing) {
            int guesses = missedLetters.size();
            if(youWin(answer, word)) {
                System.out.println("The word is " + answer + " You win!");
                if(gameOver(sc)) break;
            } else {
                answer = this.word;
                word = wordPrint(answer.length());
                missedLetters = new ArrayList<>();
            }
            System.out.println(drawGame(guesses));
            System.out.println("Missed letters" + missedLetters);
            System.out.println(word);

            if(guesses == 7) {
                System.out.println("Out of guesses. The word was " + answer);
                if(gameOver(sc)) break;
            }
        }

    }


    hangMan(String word) {
        this.word = word.toLowerCase(Locale.ROOT);
        missedLetters = new ArrayList<>();
    }

    public static void main(String[] args){
        hangMan hg = new hangMan("bananas");
        hg.begin();

    }

    boolean gameOver(Scanner scan) {
        String input = getInput(scan, "Do you want to play again? (yes or no)");
        if(input.equals("YES")) return true;
        System.out.println("That is not a choice. Enter yes or no");
        gameOver(scan);
        return false;
    }

    String getInput(Scanner sc, String text) {
        System.out.println(text);
        return sc.nextLine().toUpperCase(Locale.ROOT);
    }

    String wordPrint(int length) {
        String word = "";
        for (int i = 0; i < length; i++) word += "_";
        return word;
    }

    String changeWordPrint(String word, String answer, String guess) {
        int index = answer.indexOf(guess);
        while (index >= 0) {
            word = word.substring(0, index) + guess + word.substring(index+1);
            index = answer.indexOf(guess, index + 1);
        }
        return word;
    }

    boolean youWin(String answer,String word) {
        return answer.equals(word);
    }

    boolean answerContainsGuess(String answer, String guess) {
        if(answer.contains(guess)) {
            return true;
        }
        return false;
    }

    boolean checkDuplicate(ArrayList<String> missedLetters, String word, String guess) {
        if(word.contains(guess) || missedLetters.contains(guess))
            return true;
        return false;
    }





    String drawGame(int i) {
        switch (i) {
            default:
                return """
                         H A N G M A N
                         +---+
                             |
                             |
                             |
                            ===
                        """;
            case 1:
                return """
                         +---+
                         O   |
                             |
                             |
                            ===
                        """;
            case 2:
                return """
                         +---+
                         O   |
                         |   |
                             |
                            ===
                        """;
            case 3:
                return """
                         +---+
                         O   |
                        /|   |
                             |
                            ===
                        """;
            case 4:
                return """
                         +---+
                         O   |
                        /|\\  |
                             |
                            ===
                        """;
            case 5:
                return """
                         +---+
                         O   |
                        /|\\  |
                        /    |
                            ===
                        """;
            case 6:
                return """
                         +---+
                         O   |
                        /|\\  |
                        / \\  |
                            ===
                        """;
        }
    }
}
