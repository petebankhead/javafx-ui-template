package io.github.qupath.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Button myButton;

    public void clickButton() {
        myButton.setText("Clicked!");
    }

}
