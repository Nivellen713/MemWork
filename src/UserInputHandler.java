import java.io.IOException;
import java.util.Scanner;

public class UserInputHandler {

    public void handleUserInput() throws IOException {
        Scanner scanner = new Scanner(System.in);
        ConsoleCommand consoleCommand = new ConsoleCommand();

        for(;;) {
            String userInput = scanner.next();
            switch (userInput) {
                case "exit":
                    break;
                case "help":
                    consoleCommand.help();
                    break;
                case "mem":
                    System.out.println("write path to file:\n");
                    String pathToFile = scanner.next();
                    System.out.println("write text for the picture:\n");
                    String text = scanner.nextLine();
                    consoleCommand.mem(pathToFile, text);
                    break;
                case "place":
                    System.out.println("write text place (center, top, bottom):\n");
                    String place = scanner.next();
                    consoleCommand.changeTextPlace(place);
                    break;
                case "font":
                    System.out.println("write font for text:\n");
                    String font = scanner.nextLine();
                    consoleCommand.changeFont(font);
                    break;
                case "size":
                    System.out.println("write size of text:\n");
                    int size = scanner.nextInt();
                    consoleCommand.changeTextSize(size);
                    break;
                case "color":
                    System.out.println("write color for text:\n");
                    String color = scanner.nextLine();
                    consoleCommand.changeTextColor(color);
                    break;
                default:
                    System.out.println("use help command");
                    break;
            }
        }
    }
}
