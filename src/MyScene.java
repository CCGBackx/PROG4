import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class MyScene extends Scene {

	final int HEIGHT = 350;
	final int WIDTH = 700;
	
	private BorderPane pane;
	private BottomPane bPane;
	private LeftSliderPane lPane;
	private RightSliderPane rPane;
	private ColorPane cPane;
	private boolean automatic = false;
	private AnimationTimer timer;
	
	public MyScene() {

		super(new Pane());
		
		lPane = new LeftSliderPane(this);
		rPane = new RightSliderPane(this);
		cPane = new ColorPane();
		bPane = new BottomPane(this);
		pane = new BorderPane();	
		pane.setLeft(lPane);
		pane.setRight(rPane);
		pane.setCenter(cPane);
		pane.setBottom(bPane);
		pane.setPrefHeight(HEIGHT);
		pane.setPrefWidth(WIDTH);		
		createTimer();
		setRoot(pane);
		
	}
	
	public void setLeftColor(int red, int green, int blue) {
				
		cPane.setLeftColor(Color.rgb(red, green, blue));
		
	}
	
	public void setRightColor(int red, int green, int blue) {
		
		cPane.setRightColor(Color.rgb(red, green, blue));
		
	}
	
	public void switchOnOff() {
		automatic = !automatic;
		if (automatic) {
			timer.start();
		} else {
			timer.stop();
		}
	}

	private void createTimer() {
		timer = new AnimationTimerExt(1000) {
			@Override
			public void doAction() {
				
				 lPane.setRandomColor(); 
				 rPane.setRandomColor(); 

			}
		};
	}

}
