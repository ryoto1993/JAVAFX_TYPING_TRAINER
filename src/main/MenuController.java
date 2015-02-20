package main;

/**
 * Created by Ryoto on 2/19/2015.
 */

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class MenuController {
    @FXML
    private Ellipse homePositionTrainerButton;

    @FXML
    private Ellipse exitButton;

    @FXML
    private Ellipse homePositionTrainerKanaButton;

    @FXML
    private Ellipse moguraTatakiButton;

    @FXML
    public void enter(Event e) {
        Object tmp = e.getSource();
        if(tmp.equals(homePositionTrainerButton)) {

        } else if(tmp.equals(homePositionTrainerKanaButton)) {

        } else if(tmp.equals(moguraTatakiButton)) {

        } else if(tmp.equals(exitButton)) {
            System.exit(2);
        }
    }

    @FXML
    public void buttonOnMouseEntered(MouseEvent e) {
        Ellipse tmp;
        tmp = (Ellipse) e.getSource();
        tmp.setStroke(Color.AQUAMARINE);
        tmp.setStrokeWidth(3.0);
    }

    @FXML
    public void buttonOnMouseExited(MouseEvent e) {
        Ellipse tmp;
        tmp = (Ellipse)e.getSource();
        tmp.setStrokeWidth(0.0);
    }



}

