import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class ControlPane extends VBox {

	final int HEIGHT = 350;
	final int WIDTH = 120;
	private ButtonsPane buttonsPane;
	private ListViewPane listViewPane;
	private SliderPane sliderPane;
	private boolean useButton = true;
	private DrawPane drawPane;

	public ControlPane(DrawPane drawPane) {

		this.drawPane = drawPane;

		buttonsPane = new ButtonsPane(this);
		listViewPane = new ListViewPane(this);
		sliderPane = new SliderPane();

		setPrefWidth(WIDTH);
		setPrefHeight(HEIGHT);
		setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, null, null)));

		if (useButton) {
			getChildren().addAll(buttonsPane, sliderPane);
		} else {
			getChildren().addAll(listViewPane, sliderPane);
		}

	}

	public void setColor(String value) {
		try {
			drawPane.setColor(Color.valueOf(value));
		} catch (Exception e) {
			drawPane.setColor(Color.WHITE);
		}
	}

}
