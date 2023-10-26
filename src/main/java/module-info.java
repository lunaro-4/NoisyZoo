module com.example.noisyzoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens ipap.training.noisyzoo to javafx.fxml;
    exports ipap.training.noisyzoo;
}