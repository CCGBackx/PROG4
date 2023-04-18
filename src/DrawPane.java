import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class DrawPane extends StackPane {

	final int DRAWPANE_HEIGHT = 350;
	final int DRAWPANE_WIDTH = 380;
	final int RECTANGLE_SIZE = 180;
	private Rectangle rec1;

	
	public DrawPane() {
		
		rec1 = new Rectangle(RECTANGLE_SIZE, RECTANGLE_SIZE);
		
		setPrefHeight(DRAWPANE_HEIGHT);
		setPrefWidth(DRAWPANE_WIDTH);
		
		rec1.setFill(Color.RED);
				
		getChildren().add(rec1);
		StackPane.setAlignment(rec1,Pos.CENTER);	

		
	}
	
	public void setColor(Color color) {
		rec1.setFill(color);
	}

}
