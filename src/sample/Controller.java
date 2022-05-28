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

public class Controller {
    @FXML
    ImageView andBut1;

    @FXML
    public void press(MouseEvent event) throws InterruptedException {
        andBut1.setImage(new Image(getClass().getResourceAsStream("/test2.png")));
    }

    @FXML
    public void releas(MouseEvent event) {
        andBut1.setImage(new Image(getClass().getResourceAsStream("/test1.png")));
        System.exit(0);
    }

    @FXML
    ImageView stBut1;

    @FXML
    public void pressed(MouseEvent event) {
        stBut1.setImage(new Image(getClass().getResourceAsStream("/stbutton2.png")));
    }

    @FXML
    public void released(MouseEvent event) {
        stBut1.setImage(new Image(getClass().getResourceAsStream("/stbutton1.png")));
        Node node = (Node) event.getSource();
        Stage thisStage = (Stage) node.getScene().getWindow();
        thisStage.setScene(new Scene(root2));
        thisStage.setFullScreen(true);
    }
    @FXML
    public void clicked(MouseEvent event){

    }

    Parent root2;

    public Controller() throws IOException {
         root2 = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
         FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
         Scen2 scen2 = loader.getController();
    }
}
