module com.example.javafxmockup {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.javafxmockup to javafx.fxml;
    exports com.example.javafxmockup;
}