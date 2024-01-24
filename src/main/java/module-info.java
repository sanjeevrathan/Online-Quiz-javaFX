module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.logging;
    requires kotlin.stdlib;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}