module com.example.mockup {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires com.almasb.fxgl.all;

    opens com.example.mockup to javafx.fxml;
    exports com.example.mockup;
}