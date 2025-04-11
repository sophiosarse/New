import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import java.util.Random;

public class ButtonController {

    @FXML
    private Button clickButton;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    public void moveButton() {
        Random random = new Random();

        double sceneWidth = anchorPane.getWidth();
        double sceneHeight = anchorPane.getHeight();

        double buttonWidth = clickButton.getWidth();
        double buttonHeight = clickButton.getHeight();

        double randomX = random.nextDouble() * (sceneWidth - buttonWidth);
        double randomY = random.nextDouble() * (sceneHeight - buttonHeight);

        clickButton.setLayoutX(randomX);
        clickButton.setLayoutY(randomY);
    }
}