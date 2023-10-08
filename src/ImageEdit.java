import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class ImageEdit {
    String text;
    BufferedImage image;
    String textPlace;
    String font;
    int textSize;
    String textColor;
    // coordinates to determine the position of the text
    int x;
    int y;


    public ImageEdit(String pathToImage) throws IOException {
        this.image = ImageIO.read(new File(pathToImage));
    }

    public void addTextOnImage() throws IOException {
        determineTextPosition();
        Graphics graphics = image.getGraphics();
        graphics.drawString(text, x, y);
        graphics.setColor(Color.getColor(getColorByName(textColor)));
        graphics.setFont(Font.getFont(font));
        graphics.getFont().deriveFont(textSize);
        ImageIO.write(image, "png", new File("editedImages/testImage.png"));
    }

    private String getColorByName(String colorName) {
        try {
            Field field = Class.forName("java.awt.Color").getField(colorName);
            return (String) field.get(null);
        } catch (Exception e) {
            return null;
        }
    }

    private void determineTextPosition() {
        int width = image.getWidth();
        int heigth = image.getHeight();
        switch (textPlace) {
            case "top":
                this.y = 10;
                this.x = width / 2;
                break;
            case "center":
                this.y = heigth / 2;
                this.x = width / 2;
                break;
            case "bottom":
                this.y = heigth;
                this.x = width / 2;
                break;
            default:
                break;
        }
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTextPlace(String textPlace) {
        this.textPlace = textPlace;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }


}
