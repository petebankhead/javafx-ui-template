package io.github.qupath.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class MainApp extends Application {
    public static void main(String[] args) {
        Application.launch(MainApp.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        var url = getClass().getResource("main_control.fxml");
        if (url == null) {
            System.err.println("No URL found!");
            System.exit(-1);
        }

        ResourceBundle resources = ResourceBundle.getBundle("io.github.qupath.javafx.strings");
        Parent root = FXMLLoader.load(url, resources);

        Scene scene = new Scene(root);

        primaryStage.setTitle(resources.getString("title"));
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}