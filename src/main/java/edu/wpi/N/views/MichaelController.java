package edu.wpi.N.views;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MichaelController {

  @FXML Button btn_BackHome;

  @FXML
  public void handleOnClick(MouseEvent mouseEvent) throws IOException {
    Stage stage;
    Parent root;
    stage = (Stage) btn_BackHome.getScene().getWindow();
    root = FXMLLoader.load(getClass().getResource("homePage.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }
}
