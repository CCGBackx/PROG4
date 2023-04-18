import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class SliderPane extends HBox {

	final int HEIGHT = 200;
	final int WIDTH = 120;
	
	public SliderPane() {
		
		setPrefHeight(HEIGHT);
		setPrefWidth(WIDTH);
		setBackground(new Background( new BackgroundFill( Color.WHEAT, null, null ) ));
		
	}
	
}
