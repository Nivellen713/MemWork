import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        UserInputHandler userInputHandler = new UserInputHandler();
        ConsoleCommand consoleCommand = new ConsoleCommand();
        consoleCommand.help();
        userInputHandler.handleUserInput();


    }
}