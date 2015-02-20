package main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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

        root.setOnKeyPressed(fxmlLoader.getController());

        Media bgm = new Media(Paths.get("bgm.mp3").toUri().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(bgm);
        mediaPlayer.setVolume(0.5);
        mediaPlayer.play();

        stage.setTitle("Mode Select");
        stage.setScene(new Scene(root));
    }
}
