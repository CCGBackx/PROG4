import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class MyScene extends Scene {

	final int STAGE_HEIGHT = 350;
	final int STAGE_WIDTH = 500;
	private HBox pane;
	private DrawPane drawpane;
	private ControlPane controlepane;
	
	public MyScene() {
		
		super(new Pane());
		
		pane = new HBox();
		drawpane = new DrawPane();
		controlepane = new ControlPane(drawpane);
		
		pane.getChildren().addAll(drawpane, controlepane);
		pane.setPrefHeight(STAGE_HEIGHT);
		pane.setPrefWidth(STAGE_WIDTH);		
		setRoot(pane);
		
	}

}
