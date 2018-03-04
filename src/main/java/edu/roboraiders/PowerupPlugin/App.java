package edu.roboraiders.PowerupPlugin;

import java.util.List;

import com.google.common.collect.ImmutableList;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.theme.Theme;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;;

@Description(group = "RoboRaiders", name = "Powerup Plugin", summary = "Team 3691's Plugin for First Powerup", version = "1.0.0")
public class App extends Plugin {
	
	//private static final Theme myTheme = new Theme(App.class, "Slide Display", "SlideDisplay.css");
	
	@Override
	public List<ComponentType> getComponents() {
		return ImmutableList.of(WidgetType.forAnnotatedWidget(MyWidget.class),
				WidgetType.forAnnotatedWidget(SlideDisplay.class));
	}

}
