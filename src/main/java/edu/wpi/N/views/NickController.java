package edu.wpi.N.views;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class NickController {

  @FXML Button btn_return;

  @FXML
  private void handleOnClick(ActionEvent event) throws IOException {
    Stage stage;
    Parent root;
    stage = (Stage) btn_return.getScene().getWindow();
    root = FXMLLoader.load(getClass().getResource("homePage.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }
}
