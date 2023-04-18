import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	final int STAGE_HEIGHT = 350;
	final int STAGE_WIDTH = 500;
	
	public static void main(String[] args) {
	
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		MyScene scene = new MyScene();
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setHeight(STAGE_HEIGHT);
		primaryStage.setHeight(STAGE_WIDTH);
		primaryStage.show();
		
	}

}
