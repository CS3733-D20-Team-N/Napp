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
  @FXML Button btn_backToKiosk;

  @FXML
  private void handleOnClick(MouseEvent event) throws IOException {
    Stage stage;
    Parent root;
    if (event.getSource() == btn_Annie) {
      stage = (Stage) btn_Annie.getScene().getWindow();
      root = FXMLLoader.load(getClass().getResource("anniePage.fxml"));
    } else if (event.getSource() == btn_Nick) {
      stage = (Stage) btn_Nick.getScene().getWindow();
      root = FXMLLoader.load(getClass().getResource("nickPage.fxml"));
    } else if (event.getSource() == btn_Michael) {
      stage = (Stage) btn_Michael.getScene().getWindow();
      root = FXMLLoader.load(getClass().getResource("michaelPage.fxml"));
    } else if (event.getSource() == btn_Matt) {
      stage = (Stage) btn_Matt.getScene().getWindow();
      root = FXMLLoader.load(getClass().getResource("mattPage.fxml"));
    } else {
      stage = (Stage) btn_backToKiosk.getScene().getWindow();
      root = FXMLLoader.load(getClass().getResource("kioskHome.fxml"));
    }
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }
}
