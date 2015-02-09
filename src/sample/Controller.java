package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label label;

    public Controller(Label label) {
        this.label = label;
    }
}
