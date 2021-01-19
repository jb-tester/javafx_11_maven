module com.mytests.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mytests.javafx to javafx.fxml;
    exports com.mytests.javafx;
}