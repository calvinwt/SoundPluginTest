package com.fixermark.soundwidget.widget;


import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

@Description(
    name = "Simple Point",
    dataTypes = Boolean.class,
    summary = "Displays the X and Y coordinates of a point"
)
@ParametrizedController("SoundWidget.fxml")
public final class SoundWidget extends SimpleAnnotatedWidget<Boolean> {

  @FXML
  private Pane root;

  
  Media sound = new Media("file:///home/adubt/alert.wav");
  MediaPlayer player = new MediaPlayer(sound);
    
  @FXML
  private void initialize() {
    // Bind the text in the labels to the data
    // If you are unfamiliar with the -> notation used here, read the Oracle tutorial on lambda expressions:
    // https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
    //xCoordinateView.textProperty().bind(dataOrDefault.map(point -> point.getX()).map(x -> "X: " + x));
    //yCoordinateView.textProperty().bind(dataOrDefault.map(point -> point.getY()).map(y -> "Y: " + y));
    dataProperty().addListener((newValue) -> checkSoundPlay());
  }

  private void checkSoundPlay() {
    final Boolean data = getData();
    if(data.booleanValue()) {
      player.stop();
      player.play();
    }
  }

  @Override
  public Pane getView() {
    return root;
  }
}
