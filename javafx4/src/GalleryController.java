
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GalleryController {
    @FXML private ImageView imageView;
    @FXML private Button prevButton;
    @FXML private Button nextButton;

    private final Image[] images = new Image[10];
    private int currentIndex = 0;

    @FXML
    private void initialize() {
        for (int i = 0; i < 10; i++) {
            images[i] = new Image("file:images/img" + i + ".jpg");
        }

        imageView.setImage(images[0]);
        updateButtons();
    }

    @FXML
    private void showPrevious() {
        if (currentIndex > 0) {
            currentIndex--;
            imageView.setImage(images[currentIndex]);
            updateButtons();
        }
    }

    @FXML
    private void showNext() {
        if (currentIndex < images.length - 1) {
            currentIndex++;
            imageView.setImage(images[currentIndex]);
            updateButtons();
        }
    }

    private void updateButtons() {
        prevButton.setDisable(currentIndex == 0);
        nextButton.setDisable(currentIndex == images.length - 1);
    }
}
