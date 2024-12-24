package fr.rammex.datamanagergui.Listener;

import fr.rammex.datamanagergui.DataViewer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class NoInternetListener {
    @FXML
    private Button retryButton;


    @FXML
    protected void onRetryButton() throws IOException {
        Stage stage = (Stage) retryButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(DataViewer.class.getResource("logged.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        stage.setScene(scene);
    }

    @FXML
    private void onMinimizeButton(ActionEvent event) {
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    private void onCloseButton(ActionEvent event) {
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}
