import javafx.scene.layout.HBox;

public class ListViewPane extends HBox {

	final int HEIGHT = 150;
	final int WIDTH = 120;
	private ControlPane controlPane;

	public ListViewPane(ControlPane controlPane) {
	
		this.controlPane = controlPane;

		setPrefHeight(HEIGHT);
		setPrefWidth(WIDTH);
		
	}

}
