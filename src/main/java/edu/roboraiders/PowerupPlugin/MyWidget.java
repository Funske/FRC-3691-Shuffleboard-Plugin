package edu.roboraiders.PowerupPlugin;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

@Description(dataTypes = { Boolean.class }, name = "A Test Widget")
@ParametrizedController(value = "MyWidget.fxml")
public class MyWidget extends SimpleAnnotatedWidget {
	
	@FXML
	protected Pane _thePane;
	
	public Pane getView() {
		return _thePane;
	}

}
