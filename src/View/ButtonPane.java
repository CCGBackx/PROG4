package View;

import Controller.Controller;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class ButtonPane extends BorderPane {

    final private int HEIGHT = 110;
    final private int BUTTON_SIZE = 94;
    private Controller controller;
    public ButtonPane(Controller controller) {

        this.controller = controller;

        setHeight(HEIGHT);

        Button button = new Button("next");
        button.setPrefWidth(BUTTON_SIZE);
        button.setPrefHeight(BUTTON_SIZE);
        button.setOnMouseClicked(e -> showNextMessage());

        setCenter(button);

    }

    private void showNextMessage() {

        controller.showNextMessage();

    }

}
