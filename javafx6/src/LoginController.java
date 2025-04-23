import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label messageLabel;

    private final String correctUsername = "admin";
    private final String correctPassword = "1234";

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("გთხოვ შეავსო ორივე ველი");
            return;
        }

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            messageLabel.setStyle("-fx-text-fill: green;");
            messageLabel.setText("შესვლა წარმატებით შესრულდა!");
        } else {
            messageLabel.setStyle("-fx-text-fill: red;");
            messageLabel.setText("მომხმარებელი ან პაროლი არასწორია");
        }
    }
}
