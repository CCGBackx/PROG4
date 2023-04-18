import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class BottomPane extends HBox {

	final int HEIGHT = 50;
	final int WIDTH = 700;
	final int SPACING = 10;
	final int PADDING = 20;
	private ToggleGroup toggleGroup;
	private RadioButton rbOn;
	private RadioButton rbOff;
	private MyScene scene;
	
	public BottomPane(MyScene scene) {
		
		this.scene = scene;
		
		setWidth(WIDTH);
		setHeight(HEIGHT);
		setSpacing(SPACING);
		setAlignment(Pos.CENTER);
		setPadding(new Insets(PADDING));
		MyMouseListener mouselistener = new MyMouseListener();

		toggleGroup = new ToggleGroup();
		rbOn = new RadioButton("On");
		rbOff = new RadioButton("Off");
		
		rbOn.setToggleGroup(toggleGroup);
		rbOff.setToggleGroup(toggleGroup);
		rbOn.setSelected(false);
		rbOn.setOnMouseClicked(mouselistener);
		rbOff.setSelected(true);
		rbOff.setOnMouseClicked(mouselistener);
		
		getChildren().addAll(rbOn, rbOff);
		
	}

	private class MyMouseListener implements EventHandler<MouseEvent> {
		@Override
		public void handle(MouseEvent e) {
			scene.switchOnOff();
		}
	}
}
