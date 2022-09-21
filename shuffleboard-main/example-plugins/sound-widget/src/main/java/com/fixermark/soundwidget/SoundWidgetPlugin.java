package com.fixermark.soundwidget;

import edu.wpi.first.shuffleboard.api.data.DataType;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;

//import com.fixermark.soundwidget.widget.SimplePointWidget;

import java.util.List;
import java.util.Map;

/**
 * An example plugin that provides a custom data type (a 2D point) and a simple widget for viewing such data.
 */
@Description(
    group = "com.fixermark",
    name = "SoundWidget",
    version = "2019.1.1",
    summary = "An sound plugin that provides a simple data type and a widget for viewing it"
)
public final class SoundWidgetPlugin extends Plugin {

  @Override
  public List<ComponentType> getComponents() {
    return List.of(
        //WidgetType.forAnnotatedWidget(SimplePointWidget.class)
    );
  }

 
}
