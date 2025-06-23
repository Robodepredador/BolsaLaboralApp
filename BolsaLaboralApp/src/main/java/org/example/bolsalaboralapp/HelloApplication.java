package org.example.bolsalaboralapp;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        SceneManager.setPrimaryStage(stage);
        SceneManager.cambiarVista("/org/example/bolsalaboralapp/login-view.fxml", "Login");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
