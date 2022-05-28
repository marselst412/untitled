package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Scen2 {
//    @FXML
//    AnchorPane osn;
//
//    HBox pls = new HBox();
//    pls.prefWidthProperty().bind

    @FXML
    ImageView menuBut1;

    @FXML
    VBox test;


    @FXML
    ImageView exBut;

    @FXML
    ImageView clBut;

    @FXML
    public void clicke(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    public void click(MouseEvent event) {
        test.setVisible(false);
    }

    @FXML
    public void press(MouseEvent event) {
        menuBut1.setImage(new Image(getClass().getClassLoader().getResourceAsStream("menu2.PNG")));
        //test.setVisible(true);
    }

    @FXML
    public void releas(MouseEvent event) {
        menuBut1.setImage(new Image(getClass().getClassLoader().getResourceAsStream("menu.png")));
        //test.setVisible(false);
    }

    @FXML
    public void clicked(MouseEvent event) {
        Node node = (Node) event.getSource();
        Stage thisStage = (Stage) node.getScene().getWindow();
        thisStage.setScene(new Scene(root3));
        thisStage.setFullScreen(true);
    }

    Parent root3;

    public Scen2() throws IOException {
        root3 = FXMLLoader.load(getClass().getResource("Menu.fxml"));

    }
}
