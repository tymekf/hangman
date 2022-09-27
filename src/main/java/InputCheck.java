import java.util.Scanner;

public class InputCheck {

    Word word = new Word();

    void check() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input) {
            case "Y":
                System.out.println("Very well, you can't lose a game if you don't play the game\n");
                word.settingUpAGame();
                break;
            case "N":
                System.out.println("Good night, sweet prince");
                System.exit(0);
            default:
                System.out.println("Brevity is the soul of wit\n" +
                        "Once again: Y/N");
                check();
        }
    }
}