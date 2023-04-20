

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

	final int STAGE_HEIGHT = 350;
	final int STAGE_WIDTH = 500;
	private Pane pane;
	
	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		pane = new Pane();
		Scene scene = new Scene(pane);

		primaryStage.setScene(scene);
		primaryStage.setFullScreen(true);
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setResizable(false);
		primaryStage.show();
		pane.setBackground(new Background( new BackgroundFill(Color.BLACK, null, null)));
		
		scene.addEventHandler(KeyEvent.KEY_PRESSED, new MyKeyHandler());
		
		AnimationTimerExt timer = new AnimationTimerExt(1000) {
			@Override
			public void doAction() {
				addNote();
			}
		};
		
		timer.start();
	}

	private class MyKeyHandler implements EventHandler<KeyEvent> {
		@Override
		public void handle(KeyEvent event) {
			if (event.getCode() == KeyCode.ESCAPE) {
				Platform.exit();
			}
		}
	}
	
	private void addNote() {
	    PostIt postIt = new PostIt();
	    double x = Math.random() * (pane.getWidth() - 200);
	    double y = Math.random() * (pane.getHeight() - 200);
	    postIt.setLayoutX(x);
	    postIt.setLayoutY(y);
	    pane.getChildren().add(postIt);
	}


}
