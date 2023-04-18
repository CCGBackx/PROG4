import javafx.event.EventHandler;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class ButtonsPane extends HBox {

	final int HEIGHT = 150;
	final int WIDTH = 120;
	private ToggleGroup toggleGroup;
	private RadioButton rbRed;
	private RadioButton rbBlue;
	private RadioButton rbYellow;
	private ControlPane controlPane;

	public ButtonsPane(ControlPane controlPane) {

		this.controlPane = controlPane;

		setPrefHeight(HEIGHT);
		setPrefWidth(WIDTH);

		MyMouseListener mouselistener = new MyMouseListener();

		toggleGroup = new ToggleGroup();
		rbRed = new RadioButton("Red");
		rbBlue = new RadioButton("Blue");
		rbYellow = new RadioButton("Yellow");
		rbRed.setToggleGroup(toggleGroup);
		rbBlue.setToggleGroup(toggleGroup);
		rbYellow.setToggleGroup(toggleGroup);
		rbRed.setSelected(true);
		rbRed.setOnMouseClicked(mouselistener);
		rbBlue.setSelected(true);
		rbBlue.setOnMouseClicked(mouselistener);
		rbYellow.setSelected(true);
		rbYellow.setOnMouseClicked(mouselistener);
		
		getChildren().addAll(rbRed, rbBlue, rbYellow);
		
	}

	private class MyMouseListener implements EventHandler<MouseEvent> {
		@Override
		public void handle(MouseEvent e) {
			String sender = ((RadioButton) e.getSource()).getText();
			controlPane.setColor(sender);
		}
	}

}
