package edu.wpi.N.views;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HomePageController {
  @FXML Button btn_Annie;
  @FXML Button btn_Michael;
  @FXML Button btn_Nick;
  @FXML Button btn_Matt;

  @FXML
  private void handleOnClick(MouseEvent event) throws IOException {
    Stage stage;
    Parent root;
    if (event.getSource() == btn_Annie) {
      stage = (Stage) btn_Annie.getScene().getWindow();
      root = FXMLLoader.load(getClass().getResource("anniePage.fxml"));
    } else {
      stage = (Stage) btn_Nick.getScene().getWindow();
      root = FXMLLoader.load(getClass().getResource("nickPage.fxml"));
    }

    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }
}
