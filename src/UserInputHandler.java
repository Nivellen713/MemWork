import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UserInputHandler {
    ConsoleCommand consoleCommand = new ConsoleCommand();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void handleUserInput() throws IOException {

        String userInput = reader.readLine().trim();
        helpCommandCheck(userInput);
        String text = textSearch(userInput);
        userInput = userInput.replaceAll(text, "");
        userInput = userInput.replaceAll("'", "");
        String[] userInputCommands = userInput.split("\\u0020");
        String path = userInputCommands[1];
        ImageEdit imageEdit = new ImageEdit(path);
        consoleCommandSearch(imageEdit, userInputCommands);
        consoleCommand.mem(imageEdit, text);
    }

    private void helpCommandCheck(String userInput) {
        if (userInput.contains("help")) {
            consoleCommand.help();
        }
    }
    private String textSearch(String userInput){
        int firstMarkIndex = userInput.indexOf('\'');
        int lastMarkIndex = userInput.lastIndexOf('\'');
        return userInput.substring(firstMarkIndex, lastMarkIndex);
    }

    private void consoleCommandSearch(ImageEdit imageEdit, String[] userInputCommands) {
        for (int i = 3; i < userInputCommands.length; i++) {
            switch (userInputCommands[i]) {
                case "-p":
                    consoleCommand.changeTextPlace(imageEdit, userInputCommands[i+1]);
                    break;
                case "-f":
                    consoleCommand.changeFont(imageEdit, userInputCommands[i+1]);
                    break;
                case "-s":
                    consoleCommand.changeTextSize(imageEdit, Integer.parseInt(userInputCommands[i+1]));
                    break;
                case "-c":
                    consoleCommand.changeTextColor(imageEdit, userInputCommands[i+1]);
                    break;
                default:
                    System.out.println("use help command");
                    break;
            }
        }
    }
}
