module com.example.chat_application {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chat_application to javafx.fxml;
    exports com.example.chat_application;
}