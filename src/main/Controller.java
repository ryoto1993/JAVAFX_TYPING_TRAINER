package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

public class Controller {

    @FXML
    private Button key1;

    @FXML
    private Button keyJapan;

    @FXML
    private MenuItem menuItemClose;

    @FXML
    void close(ActionEvent event) {
        System.exit(2);
    }

}
