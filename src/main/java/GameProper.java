import java.util.Arrays;

public class GameProper {

    private final HangmanEndgame endgame = new HangmanEndgame();

    void searchingForALetter(String[] word, String[] answer, String letter) {
        LetterGuessing letterGuessing = new LetterGuessing();

        boolean isItAHit = false;

        for (int i = 0; i < word.length; i++) {
            if (word[i].equalsIgnoreCase(letter)) {
                isItAHit = true;
                answer[i] = letter;
            }
        }
        if (isItAHit) {
            System.out.println("How now! a rat? Dead, for a ducat, dead!");
        } else {
            System.out.println("You missed, but it was a narrow one");
        }

        if (Arrays.equals(answer, word)) {
            endgame.endingAGame();
        } else {
            letterGuessing.guessing(word, answer);
        }
    }
}