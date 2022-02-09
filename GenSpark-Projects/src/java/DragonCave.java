import java.util.InputMismatchException;
import java.util.Scanner;

public class DragonCave {
    public String intro() {
        return """
                You are in a land full of dragons. In front of you, you see two caves. In one cave, the dragon is friendly
                and will share his treasure with you. The other dragon is greedy and hungry and will eat you on sight.
                Which cave will you go into?: 
                """;
    }

    public String caveChoice(int a) {
        if(a == 1) {
            return "You die.";
        } else if(a == 2) {
            return "You live.";
        }
        return "Your input was not 1 or 2";
    }



    public static void main(String[] args) {
        var dc = new DragonCave();
        Scanner sc = new Scanner(System.in);
        System.out.println(dc.intro());
        try {
            int num = sc.nextInt();
            System.out.println(dc.caveChoice(num));
            sc.close();
        } catch(InputMismatchException e){
            System.out.println("Input is of incorrect type.");
        }

    }
}