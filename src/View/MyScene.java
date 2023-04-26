package View;

import Controller.Controller;
import Model.Message;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class MyScene extends Scene {

    public MyScene(Controller controller, Message message) {

        super(new Pane());

        DrawPane drawPane = new DrawPane(message);
        ButtonPane buttonPane = new ButtonPane(controller);

        VBox pane = new VBox();

        pane.getChildren().addAll(drawPane, buttonPane);

        setRoot(pane);

    }
}
