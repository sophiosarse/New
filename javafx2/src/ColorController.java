import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import java.util.Random;

public class ColorController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    public void changeBackgroundColor() {
        Random random = new Random();
        int r = random.nextInt(256);  // 0-255
        int g = random.nextInt(256);  // 0-255
        int b = random.nextInt(256);  // 0-255

        String color = String.format("rgb(%d, %d, %d)", r, g, b);

        anchorPane.setStyle("-fx-background-color: " + color + ";");
    }
}