package edu.wpi.N.views;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomePageController {
  @FXML Button btn_Annie;
  @FXML Button btn_Michael;
  @FXML Button btn_Nick;
  @FXML Button btn_Matt;

  @FXML
  private void handleOnClick(ActionEvent event) throws IOException {
    Stage stage;
    Parent root;
    stage = (Stage) btn_Nick.getScene().getWindow();
    root = FXMLLoader.load(getClass().getResource("views/nickPage.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    //        if (event.getSource() == btnScene1) {
    //            stage = (Stage) btnScene1.getScene().getWindow();
    //            root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
    //        }
    //        else {
    //            stage = (Stage) btnScene2.getScene().getWindow();
    //            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    //        }
    //        Scene scene = new Scene(root);
    //        stage.setScene(scene);
    //        stage.show();
  }
}
