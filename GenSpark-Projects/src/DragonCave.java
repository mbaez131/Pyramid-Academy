import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you, you see two caves. In one cave, the dragon is friendly" +
                " and will share his treasure with you. The other dragon is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into?: ");
        int num = sc.nextInt();
        if(num == 1) {
            System.out.println("You approach the cave... " + "it is dark and spooky... " + "A large dragon jumps out in front of you! " + "He opens his jaws and..." + " Gobbles you down in one bite!");
        } else if(num == 2){
            System.out.println("The friendly dragon gives you all the treasure and you become pals... the end!");
        } else {
            System.out.println("Your input was not 1 or 2");
        }
        sc.close();
    }
}