import java.util.Arrays;
import java.util.Scanner;

public class LetterGuessing {

    void guessing(String[] word, String[] answer) {
        GameProper game = new GameProper();
        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.toString(answer));
        System.out.println("\nPick a letter:");
        String letter = in.nextLine();
        if (letter.length() > 1) {
            System.out.println("You really don't know the rules? One letter, pal, just one. " +
                    "Let me trim that for you, before someone gets hurt");
            letter = letter.substring(0, 1);
        }
        game.searchingForALetter(word, answer, letter);
    }
}