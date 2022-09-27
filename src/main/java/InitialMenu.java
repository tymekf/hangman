import java.util.Scanner;

public class InitialMenu {

    InputCheck inputCheck = new InputCheck();

    void printMenu() {
//        Scanner scanner = new Scanner(System.in);
//        Word word = new Word();
        System.out.println("Do you want a play a game of hangman?\n" +
                "Y/N");
        inputCheck.check();
    }
}
