import com.sun.javafx.geom.Rectangle;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        //1
//        Text text = new Text("გამარჯობა ეს არის აპლიკაცია");
//
//        StackPane root = new StackPane();
//        root.getChildren().add(text);
//
//        root.setStyle("-fx-background-color: #710482");
//        text.setFill(Color.WHITE);
//
//        Scene scene = new Scene(root, 400, 200);
//
//        primaryStage.setResizable(false);
//
//        primaryStage.setTitle("JavaFX აპლიკაცია");
//        primaryStage.setScene(scene);
//        primaryStage.show();

        //2
//        Pane pane = new Pane();
//
//        // მწვანე კვადრატი
//        Rectangle square = new Rectangle(100, 100, 100, 100);
//        square.setFill(Color.GREEN);
//        pane.getChildren().add(square);
//
//        Line diagonal1 = new Line(100, 100, 200, 200);
//        diagonal1.setStroke(Color.YELLOW);
//        diagonal1.setStrokeWidth(2);
//
//        Line diagonal2 = new Line(200, 100, 100, 200);
//        diagonal2.setStroke(Color.YELLOW);
//        diagonal2.setStrokeWidth(2);
//
//        int rectX = 350, rectY = 150, rectWidth = 200, rectHeight = 300;
//        Line line1 = new Line(rectX, rectY, rectX + rectWidth, rectY);
//        line1.setStroke(Color.BLUE);
//
//        Line line2 = new Line(rectX, rectY, rectX, rectY + rectHeight);
//        line2.setStroke(Color.BLUE);
//
//        Line line3 = new Line(rectX + rectWidth, rectY, rectX + rectWidth, rectY + rectHeight);
//        line3.setStroke(Color.BLUE);
//
//        Line line4 = new Line(rectX, rectY + rectHeight, rectX + rectWidth, rectY + rectHeight);
//        line4.setStroke(Color.BLUE);
//
//        pane.getChildren().addAll(diagonal1, diagonal2, line1, line2, line3, line4);
//
//        Scene scene = new Scene(pane, 600, 500);
//        primaryStage.setTitle("JavaFX Shapes");
//        primaryStage.setScene(scene);
//        primaryStage.show();


        //3
//
//        Pane pane = new Pane();
//
//        Circle face = new Circle(150, 150, 100);
//        face.setFill(Color.YELLOW);
//        face.setStroke(Color.BLACK);
//
//        Circle leftEye = new Circle(120, 130, 10);
//        leftEye.setFill(Color.BLACK);
//        Circle rightEye = new Circle(180, 130, 10);
//        rightEye.setFill(Color.BLACK);
//
//        Line mouth = new Line(120, 180, 180, 180);
//        mouth.setStroke(Color.BLACK);
//        mouth.setStrokeWidth(5);
//
//        pane.getChildren().addAll(face, leftEye, rightEye, mouth);
//
//        Scene scene = new Scene(pane, 300, 300);
//        primaryStage.setTitle("Smiley Face");
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
