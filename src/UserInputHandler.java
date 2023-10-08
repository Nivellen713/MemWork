import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputHandler {

    public void handleUserInput() throws IOException {
        ConsoleCommand consoleCommand = new ConsoleCommand();


        String userInput;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            userInput = reader.readLine();
            switch (userInput) {
                case "help":
                    consoleCommand.help();
                    break;
                case "mem":
                    System.out.println("write path to file: ");
                    String pathToFile = reader.readLine();
                    System.out.print("write text for the picture: ");
                    String text = reader.readLine();
                    consoleCommand.mem(pathToFile, text);
                    break;
                case "place":
                    System.out.println("write text place (center, top, bottom): ");
                    String place = reader.readLine();
                    consoleCommand.changeTextPlace(place);
                    break;
                case "font":
                    System.out.println("write font for text: ");
                    String font = reader.readLine();
                    consoleCommand.changeFont(font);
                    break;
                case "size":
                    System.out.println("write size of text: ");
                    String size = reader.readLine();
                    consoleCommand.changeTextSize(Integer.parseInt(size));
                    break;
                case "color":
                    System.out.println("write color for text: ");
                    String color = reader.readLine();
                    consoleCommand.changeTextColor(color);
                    break;
                default:
                    System.out.println("use help command");
                    break;
            }
        } while (!userInput.equals("exit"));
    }
}
