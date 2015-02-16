package main;/**
 * Created by Ryoto on 2/9/2015.
 */

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException{
        new TypingGame(stage);
        stage.show();
    }
}
