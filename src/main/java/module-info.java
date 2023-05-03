module com.example.floppaflip {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.floppaflip to javafx.fxml;
    exports com.example.floppaflip;
}