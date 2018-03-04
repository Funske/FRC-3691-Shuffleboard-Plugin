package edu.roboraiders.PowerupPlugin;

import edu.wpi.first.shuffleboard.api.data.types.NumberType;
import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

@Description(dataTypes = { NumberType.class }, name = "Slide Display")
@ParametrizedController(value = "SlideDisplay.fxml")
public class SlideDisplay extends SimpleAnnotatedWidget<Number> {

	@FXML
	protected AnchorPane _thePane;

	@FXML
	protected ProgressBar _theBar;
	
	@Override
	public Pane getView() {
		
		_theBar.progressProperty().bind(this.dataProperty());
		
		return _thePane;
	}

}
