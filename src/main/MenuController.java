package main;

/**
 * Created by Ryoto on 2/19/2015.
 */

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

enum Mode {
    homePositionTrainer,
    homePositionTrainerKana,
    moguraTataki,
    exit
}

public class MenuController {
    Mode mode = Mode.homePositionTrainer;

    @FXML
    private Ellipse homePositionTrainerButton;

    @FXML
    private Ellipse exitButton;

    @FXML
    private Ellipse homePositionTrainerKanaButton;

    @FXML
    private Ellipse moguraTatakiButton;

    @FXML
    public void enter() {
        switch (mode) {
            case homePositionTrainer:

                break;
            case homePositionTrainerKana:

                break;
            case moguraTataki:

                break;
            case exit:
                System.exit(2);
                break;
        }
    }

    private void clearStroke() {
        homePositionTrainerButton.setStrokeWidth(0.0);
        homePositionTrainerKanaButton.setStrokeWidth(0.0);
        moguraTatakiButton.setStrokeWidth(0.0);
        exitButton.setStrokeWidth(0.0);
    }

    @FXML
    public void buttonOnMouseEntered(MouseEvent e) {
        Ellipse tmp;
        tmp = (Ellipse) e.getSource();

        if(tmp.equals(homePositionTrainerButton)) mode = Mode.homePositionTrainer;
        else if(tmp.equals(homePositionTrainerKanaButton)) mode = Mode.homePositionTrainerKana;
        else if(tmp.equals(moguraTatakiButton)) mode = Mode.moguraTataki;
        else mode = Mode.exit;

        clearStroke();

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

