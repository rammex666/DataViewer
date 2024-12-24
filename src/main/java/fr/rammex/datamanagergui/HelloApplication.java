package fr.rammex.datamanagergui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        stage.setTitle("DataViewer");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("icon_dataviewer.png")));
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}