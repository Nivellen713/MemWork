import java.io.IOException;

public class ConsoleCommand {
    public void help(){
        System.out.println("""
                help - see manual
                mem - add your text to selected picture
                place - change text place (center, top, bottom)
                font - change font
                size - change text size
                color - change text color
                exit - turn off program
                """);
    }

    public void mem(String pathToFile, String text) throws IOException {
        ImageEdit imageEdit = new ImageEdit(pathToFile);
        imageEdit.addTextOnImage(text);
    }

    public void changeTextPlace(String place){

    }

    public void changeFont(String font){

    }

    public void changeTextSize(int size){

    }

    public void changeTextColor(String color){

    }
}
