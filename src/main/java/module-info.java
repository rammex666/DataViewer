module fr.rammex.datamanagergui {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.rammex.datamanagergui to javafx.fxml;
    opens fr.rammex.datamanagergui.Listener to javafx.fxml;

    exports fr.rammex.datamanagergui;
    exports fr.rammex.datamanagergui.Listener;
}