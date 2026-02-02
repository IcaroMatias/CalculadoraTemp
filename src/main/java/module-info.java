module com.example.calculadoratemp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculadoratemp to javafx.fxml;
    exports com.example.calculadoratemp;
}