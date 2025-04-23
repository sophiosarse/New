import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.CheckBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GreetingCardController {
    @FXML private CheckBox balloonsCheck;
    @FXML private CheckBox heartsCheck;
    @FXML private CheckBox starsCheck;
    @FXML private Canvas canvas;

    private final Random random = new Random();

    @FXML
    private void generateCard() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        List<String> shapes = new ArrayList<>();
        if (balloonsCheck.isSelected()) shapes.add("\uD83C\uDF88");
        if (heartsCheck.isSelected()) shapes.add("❤");
        if (starsCheck.isSelected()) shapes.add("⭐");

        if (shapes.isEmpty()) return;

        // Draw 30 random emojis
        for (int i = 0; i < 30; i++) {
            String shape = shapes.get(random.nextInt(shapes.size()));
            double x = random.nextDouble() * (canvas.getWidth() - 30);
            double y = random.nextDouble() * (canvas.getHeight() - 30);
            gc.fillText(shape, x, y + 20);
        }
    }
}
