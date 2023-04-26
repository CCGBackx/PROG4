package Controller;

import Model.Message;
import View.MyScene;
import javafx.application.Application;
import javafx.stage.Stage;

public class Controller extends Application {

    private Message message;
    final private String[] messagelist = {
            "Hallo, dit is het eerste bericht uit de lijst.", "Groetjes"};

    private int messageCount = 0;
    public Controller() {

        message = new Message();

    }

    @Override
    public void start(Stage stage) {

        MyScene myscene = new MyScene(this, message);
        stage.setTitle("PROG4 PR2a_brons");
        stage.setScene(myscene);
        stage.show();

    }

    public void startup(String[] args) {

        launch(args);

    }

    public void showNextMessage() {

        if((messagelist.length) == messageCount) return;

        message.setMessageText(messagelist[messageCount]);
        messageCount++;

    }

}
