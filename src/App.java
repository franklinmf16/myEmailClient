import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


import java.awt.*;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane parent = FXMLLoader.load(getClass().
                getResource("MainLayout.fxml"));

        Scene scene = new Scene(parent);
        scene.getStylesheets().add(getClass().
                getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
