module com.example.damahotova {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.damahotova to javafx.fxml;
    exports com.example.damahotova;
}