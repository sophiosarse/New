////1
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//import javafx.stage.WindowEvent;
//
//public class Main extends Application {
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));
//        Scene scene = new Scene(root, 600, 400);
//        stage.setTitle("Brain Buster App");
//
//        stage.setOnCloseRequest(WindowEvent::consume);
//
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}

//2
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//    @Override
//    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("/scenes/MainScene.fxml"));
//        stage.setTitle("Multi-Scene App");
//        stage.setScene(new Scene(root, 400, 300));
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
