package fr.rammex.datamanagergui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button account;


    @FXML
    protected void onAccountHomeButtonClick() throws IOException {
        Stage stage = (Stage) account.getScene().getWindow();
        System.out.println("Account button clicked!");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("logged.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        stage.setScene(scene);
    }

    @FXML
    protected void onAccountLoggedButtonClick() throws IOException {
        Stage stage = (Stage) account.getScene().getWindow();
        System.out.println("Logged button clicked!");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        stage.setScene(scene);
    }
}