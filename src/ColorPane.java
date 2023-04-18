import javafx.animation.AnimationTimer;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;

public class ColorPane extends HBox {

	final int HEIGHT = 300;
	final int WIDTH = 300;
	private Pane pane;
	private Pane rightPane;
	private Color leftColor;
	private Color rightColor;

	public ColorPane() {

		setWidth(WIDTH);
		setHeight(HEIGHT);

		pane = new Pane();
		rightPane = new Pane();

		pane.setPrefWidth(WIDTH);
		pane.setPrefHeight(HEIGHT);

		getChildren().add(pane);
	}

	public void setLeftColor(Color color) {

		leftColor = color;
		changeBackground();

	}

	public void setRightColor(Color color) {

		rightColor = color;
		changeBackground();

	}

	public void changeBackground() {

		Stop[] leftStops = new Stop[] { new Stop(0, leftColor), new Stop(1, rightColor) };
		LinearGradient leftGradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, leftStops);

		pane.setBackground(new Background(new BackgroundFill(leftGradient, null, null)));

	}

}
