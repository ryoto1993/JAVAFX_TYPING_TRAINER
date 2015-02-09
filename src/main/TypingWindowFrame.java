package main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Ryoto on 2/9/2015.
 */
public class TypingWindowFrame {
    public TypingWindowFrame(Stage stage) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("TypingWindowFrame.fxml"));

        stage.setTitle("Typing Trainer");
        stage.setScene(new Scene(root)  );
    }
}
