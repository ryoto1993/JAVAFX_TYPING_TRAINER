package main;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class TypingController /* implements EventHandler<KeyEvent> */ {

    @FXML
    public Button key1;

    @FXML
    private Button key2;

    @FXML
    private Button key0;

    @FXML
    private Button keyHenkan;

    @FXML
    private Button key5;

    @FXML
    private Button key6;

    @FXML
    private Button key3;

    @FXML
    private Button key4;

    @FXML
    private Button key9;

    @FXML
    private Button key7;

    @FXML
    private Button keyMinus;

    @FXML
    private Button key8;

    @FXML
    private Button keyPeriod;

    @FXML
    private Button keyCoron;

    @FXML
    private Button keyAlt;

    @FXML
    private Button keyRShift;

    @FXML
    private Button keyWin;

    @FXML
    private Button keyRBracket;

    @FXML
    private Button keySemiCoron;

    @FXML
    private Button keyLBracket;

    @FXML
    private Button keyRAlt;

    @FXML
    private Button keyCtrl;

    @FXML
    private Button keyBackSlash;

    @FXML
    private Button keyCaps;

    @FXML
    private Button keyRCtrl;

    @FXML
    private Button keyHankaku;

    @FXML
    private Button keyShift;

    @FXML
    private Button keySpace;

    @FXML
    private Button keyMuhenkan;

    @FXML
    private Button keyYen;

    @FXML
    private Button keyQ;

    @FXML
    private Button keyR;

    @FXML
    private Button keyAt;

    @FXML
    private Button keyHat;

    @FXML
    private Button keyO;

    @FXML
    private Button keyP;

    @FXML
    private Button keyBS;

    @FXML
    private Button keyU;

    @FXML
    private Button keyV;

    @FXML
    private Button keyS;

    @FXML
    private Button keyT;

    @FXML
    private Button keyComma;

    @FXML
    private Button keyTab;

    @FXML
    private Button keyY;

    @FXML
    private Button keyKana;

    @FXML
    private Button keyZ;

    @FXML
    private Button keyW;

    @FXML
    private Button keyX;

    @FXML
    private Button keySlash;

    @FXML
    private Button keyA;

    @FXML
    private Button keyB;

    @FXML
    private Button keyCaps158;

    @FXML
    private Button keyE;

    @FXML
    private Button keyF;

    @FXML
    private Button keyC;

    @FXML
    private Button keyD;

    @FXML
    private Button keyI;

    @FXML
    private Button keyJ;

    @FXML
    private Button keyG;

    @FXML
    private Button keyH;

    @FXML
    private Button keyM;

    @FXML
    private MenuItem menuItemClose;

    @FXML
    private Button keyN;

    @FXML
    private Button keyK;

    @FXML
    private Button keyL;

    @FXML
    private TextField inputBox;

    @FXML
    void close() {
        System.exit(2);
    }

    @FXML
    void shiftPressed() {
        key1.setText("!");
        key2.setText("\"");
        key3.setText("#");
        key4.setText("$");
        key5.setText("%");
        key6.setText("&");
        key7.setText("'");
        key8.setText("(");
        key9.setText(")");
        key0.setText("");
        keyMinus.setText("=");
        keyHat.setText("~");
        keyYen.setText("|");

    }
    @FXML
    void shiftReleased() {
        key1.setText("1");
        key2.setText("2");
        key3.setText("3");
        key4.setText("4");
        key5.setText("5");
        key6.setText("6");
        key7.setText("7");
        key8.setText("8");
        key9.setText("9");
        key0.setText("0");
        keyMinus.setText("-");
        keyHat.setText("^");
        keyYen.setText("\\");
    }

    @FXML
    public void updateInputBox(String s) {
        inputBox.setText(s);
    }

    // this is key handler catching
    @FXML
    public void keyPressedHandle(KeyEvent event) {
        if(event.getCode().equals(KeyCode.SHIFT)) {
            shiftPressed();
        }
    }
    @FXML
    public void keyReleasedHandle(KeyEvent event) {
        if(event.getCode().equals(KeyCode.SHIFT)) {
            shiftReleased();
        }

    }

}
