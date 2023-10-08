import java.io.IOException;

public class ConsoleCommand {

    public void help(){
        System.out.println("""
                help - see manual
                mem - add your text to selected picture
                -p - change text place (center, top, bottom)
                -f - change font
                -s - change text size
                -c - change text color
                """);
    }

    public void mem(ImageEdit imageEdit, String text) throws IOException {
        imageEdit.setText(text);
        imageEdit.addTextOnImage();
    }

    public void changeTextPlace(ImageEdit imageEdit, String place){
        imageEdit.setTextPlace(place);
    }

    public void changeFont(ImageEdit imageEdit, String font){
        imageEdit.setFont(font);
    }

    public void changeTextSize(ImageEdit imageEdit, int size){
        imageEdit.setTextSize(size);
    }

    public void changeTextColor(ImageEdit imageEdit, String color){
        imageEdit.setTextColor(color);
    }
}
