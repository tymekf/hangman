import java.util.Arrays;
import java.util.Scanner;

public class Word {

    LetterGuessing letterGuessing = new LetterGuessing();

    Scanner scanner = new Scanner(System.in);

    void settingUpAGame() {
        System.out.println("Enter a word for a second player to guess:");
        String password = scanner.nextLine();

        String[] word = new String[password.length()];
        for (int i = 0; i < word.length; i++) {
            word[i] = password.substring(i, i + 1);
        }
        String[] answer = new String[password.length()];
        Arrays.fill(answer, "-");
        System.out.println("\n\nPora na drugiego gracza, powodzonka");
        letterGuessing.guessing(word, answer);
    }
}
