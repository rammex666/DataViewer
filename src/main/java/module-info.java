module fr.rammex.datamanagergui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens fr.rammex.datamanagergui to javafx.fxml;
    exports fr.rammex.datamanagergui;
}