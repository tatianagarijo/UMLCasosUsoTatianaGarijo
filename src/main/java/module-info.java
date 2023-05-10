module com.example.uml_casosusotga {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uml_casosusotga to javafx.fxml;
    exports com.example.uml_casosusotga;
}