package fr.rammex.datamanagergui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class DataViewer extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.initStyle(StageStyle.UNDECORATED);

        // Check if the user is connected to the internet
        try{
            if(InternetChecker.isConnected()) {
                FXMLLoader fxmlLoader = new FXMLLoader(DataViewer.class.getResource
                        ("noInternet.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 360, 720);
                stage.setTitle("DataViewer");
                stage.setResizable(false);
                stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("assets/icon_dataviewer.png"))));
                scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style/noInternet.css")).toExternalForm());
                stage.setScene(scene);
                stage.show();
                return;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Load the home page
        FXMLLoader fxmlLoader = new FXMLLoader(DataViewer.class.getResource
                ("home.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        stage.setTitle("DataViewer");
        stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream
                ("assets/icon_dataviewer.png"))));
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource
                ("style/style.css")).toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}