import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CircleController {

    @FXML
    private Circle myGameCircle;

    private final double STEP = 10;
    private final Color[] colors = {Color.RED, Color.BLACK, Color.GREEN, Color.BLUE, Color.ORANGE};
    private int colorIndex = 0;

    @FXML
    private void up() {
        myGameCircle.setLayoutY(myGameCircle.getLayoutY() - STEP);
    }

    @FXML
    private void down() {
        myGameCircle.setLayoutY(myGameCircle.getLayoutY() + STEP);
    }

    @FXML
    private void left() {
        myGameCircle.setLayoutX(myGameCircle.getLayoutX() - STEP);
    }

    @FXML
    private void right() {
        myGameCircle.setLayoutX(myGameCircle.getLayoutX() + STEP);
    }

    @FXML
    private void upLeft() {
        myGameCircle.setLayoutX(myGameCircle.getLayoutX() - STEP);
        myGameCircle.setLayoutY(myGameCircle.getLayoutY() - STEP);
    }

    @FXML
    private void upRight() {
        myGameCircle.setLayoutX(myGameCircle.getLayoutX() + STEP);
        myGameCircle.setLayoutY(myGameCircle.getLayoutY() - STEP);
    }

    @FXML
    private void downLeft() {
        myGameCircle.setLayoutX(myGameCircle.getLayoutX() - STEP);
        myGameCircle.setLayoutY(myGameCircle.getLayoutY() + STEP);
    }

    @FXML
    private void downRight() {
        myGameCircle.setLayoutX(myGameCircle.getLayoutX() + STEP);
        myGameCircle.setLayoutY(myGameCircle.getLayoutY() + STEP);
    }

    @FXML
    private void makeRed() {
        myGameCircle.setFill(Color.RED);
    }

    @FXML
    private void nextColor() {
        colorIndex = (colorIndex + 1) % colors.length;
        myGameCircle.setFill(colors[colorIndex]);
    }
}