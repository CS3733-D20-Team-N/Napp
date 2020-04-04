package edu.wpi.N.views;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class MattController {

  @FXML Button btn_goToMain;
  @FXML ColorPicker colorPicker;

  private void handleOnClick(MouseEvent event) throws IOException {
    Stage stage;
    Parent root;
    stage = (Stage) btn_goToMain.getScene().getWindow();
    root = FXMLLoader.load(getClass().getResource("homePage.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  public void handle(ActionEvent event) throws IOException {
    Color c = colorPicker.getValue();

    System.out.println("New Color's RGB = "+c.getRed()+" "+c.getGreen()+" "+c.getBlue())
  }

}
