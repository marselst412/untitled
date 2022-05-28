package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;


public class Menucl {
    @FXML
    ImageView vern;
    @FXML
    ImageView exBut;

    @FXML
    public void click(MouseEvent event) {
        exBut.setImage(new Image(getClass().getClassLoader().getResourceAsStream("stbutton2.PNG")));
        System.exit(0);
    }

    @FXML
    public void pressed(MouseEvent event) {
        vern.setImage(new Image(getClass().getClassLoader().getResourceAsStream("stbutton2.PNG")));
        Node node = (Node) event.getSource();
        Stage thisStage = (Stage) node.getScene().getWindow();
        thisStage.setScene(new Scene(root2));
        thisStage.setFullScreen(true);
    }
    Parent root2;
}

