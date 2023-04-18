import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

public class ListViewPane extends HBox {

	final int HEIGHT = 150;
	final int WIDTH = 120;
	private ControlPane controlPane;
	private ListView<String> listView;
	final String[] mycolorlist = { "GREENYELLOW", "FANTASY", "ORANGERED", "SADDLEBROWN", "DEEPSKYBLUE", "LAVENDER", "BISQUE", "FORESTGREEN" };
	
	public ListViewPane(ControlPane controlPane) {
	
		this.controlPane = controlPane;

		listView = new ListView<String>(); 
		setPrefHeight(HEIGHT);
		setPrefWidth(WIDTH);
		
		listView.getSelectionModel().selectedItemProperty()
		.addListener(new MyListViewListener()); listView.setItems(FXCollections.observableArrayList(mycolorlist));
		
		getChildren().add(listView);
		
	}

	private class MyListViewListener implements ChangeListener<String> {

		@Override
		public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
			controlPane.setColor(newValue);
		}
		
	}
}
