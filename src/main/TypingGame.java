package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

/**
 * Created by Ryoto on 2/9/2015.
 */
public class TypingGame {
    private TextField inputBox;
    TypingController typingController;

    public TypingGame(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(getClass().getResource("HomePositionTrainerFrame.fxml").openStream());
        root.setOnKeyPressed(new TypingController());
        typingController = (TypingController)fxmlLoader.getController();

        stage.setTitle("Typing Trainer");
        stage.setScene(new Scene(root)  );

        homePositionTrain();

    }

    public void homePositionTrain() {
        int v, f;
        Random random = new Random();

        typingController.updateInputBox("Hello!");

        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                if(i<5) {
                    f = random.nextInt(8);
                    switch(f) {
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        case 5:

                            break;
                        case 6:

                            break;
                        case 7:

                            break;
                        case 8:

                            break;
                    }
                } else {

                }
            }
        }
    }


}
