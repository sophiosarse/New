package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    public void goToYellow(ActionEvent event) throws IOException {
        switchScene(event, "/scenes/YellowScene.fxml");
    }

    public void goToRed(ActionEvent event) throws IOException {
        switchScene(event, "/scenes/RedScene.fxml");
    }

    public void goToGreen(ActionEvent event) throws IOException {
        switchScene(event, "/scenes/GreenScene.fxml");
    }

    private void switchScene(ActionEvent event, String fxmlPath) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}
