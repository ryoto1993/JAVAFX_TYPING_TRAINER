package main;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * Created by Ryoto on 2/19/2015.
 */
public class Menu {

    public Menu(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(getClass().getResource("MenuFrame.fxml").openStream());

        stage.setResizable(false);
        stage.sizeToScene();

        Media bgm = new Media(Paths.get("bgm.mp3").toUri().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(bgm);
        mediaPlayer.setVolume(0.5);
        mediaPlayer.play();

        Scene scene = new Scene(root);
        scene.setOnKeyPressed(fxmlLoader.<EventHandler<KeyEvent>>getController());

        stage.setTitle("Mode Select");
        stage.setScene(scene);
    }
}
