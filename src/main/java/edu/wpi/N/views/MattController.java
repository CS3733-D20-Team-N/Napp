package edu.wpi.N.views;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Arc;
import javafx.stage.Stage;
import javax.swing.*;

public class MattController {

  @FXML Button btn_goToMain;
  @FXML ColorPicker colorPicker;
  @FXML Slider slider;
  @FXML Arc fillArc;

  @FXML
  private void handleOnClick(MouseEvent event) throws IOException {
    Stage stage;
    Parent root;
    stage = (Stage) btn_goToMain.getScene().getWindow();
    root = FXMLLoader.load(getClass().getResource("homePage.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  @FXML
  public void colorPickHandle(ActionEvent event) throws IOException {
    fillArc.setFill(colorPicker.getValue());
  }

  @FXML
  public void sliderHandler(MouseEvent event) throws IOException {
    double value = (double) slider.getValue();
    // System.
    fillArc.setLength(value);
  }
}
