import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageEdit {

    String pathToImage;
    BufferedImage image;

    public ImageEdit(String pathToImage) throws IOException {
        this.pathToImage = pathToImage;
        this.image = ImageIO.read(new File(pathToImage));
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void addTextOnImage(String text) throws IOException {
        Graphics graphics = image.getGraphics();
        graphics.drawString(text, 100, 100);
        ImageIO.write(image, "png", new File("editedImages/testImage.png"));
    }

}
