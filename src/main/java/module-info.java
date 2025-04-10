module org.example.firstapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;

    opens org.example.firstapp to javafx.fxml;
    exports org.example.firstapp;
}