package Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("my fx application");

        Parent p = FXMLLoader.load(getClass().getResource("/UI/LoginUtama.fxml"));

        Scene scene1 = new Scene(p);

        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
