import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PetController {
    @FXML private RadioButton catRadio;
    @FXML private RadioButton dogRadio;
    @FXML private RadioButton bunnyRadio;
    @FXML private RadioButton birdRadio;
    @FXML private TextField nameField;
    @FXML private Label resultLabel;
    @FXML private ToggleGroup petGroup;

    @FXML
    private void onConfirmClick() {
        RadioButton selectedPet = (RadioButton) petGroup.getSelectedToggle();
        String petName = nameField.getText().trim();

        if (selectedPet != null && !petName.isEmpty()) {
            resultLabel.setText("შენ აირჩიე " + selectedPet.getText() + " სახელად " + petName);
        } else {
            resultLabel.setText("გთხოვ აირჩიო ცხოველი და შეიყვანო სახელი.");
        }
    }
}
