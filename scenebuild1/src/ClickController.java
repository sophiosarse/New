import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Optional;

public class ClickController {

    @FXML
    private Button clickButton;

    private int clickCount = 0;

    @FXML
    public void handleClick() {
        clickCount++;
        if (clickCount == 5) {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirm Exit");
            alert.setHeaderText("გსურთ აპლიკაციის გამორთვა?");
            alert.setContentText("დაჭირე OK გასათიშად, ან Cancel გასაგრძელებლად");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                Stage stage = (Stage) clickButton.getScene().getWindow();
                stage.close();
            } else {
                clickCount = 0;
            }
        }
    }
}
