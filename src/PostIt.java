import java.util.ArrayList;

import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class PostIt extends HBox {
	
	final int SIZE = 200;
	private int MAX_COLOR_VALUE = 155;
	private int MIN_COLOR_VALUE = 100;
	String[] words = {
			   "apple",
			   "banana",
			   "cherry",
			   "date",
			   "elderberry",
			   "fig",
			   "grape",
			   "honeydew",
			   "kiwi",
			   "lemon",
			   "mango",
			   "nectarine",
			   "orange",
			   "pear",
			   "quince",
			   "raspberry",
			   "strawberry",
			   "tangerine",
			   "watermelon",
			   "yellow apple",
			   "black banana",
			   "red cherry",
			   "brown date",
			   "purple elderberry",
			   "green fig",
			   "blue grape",
			   "orange honeydew",
			   "yellow kiwi",
			   "green lemon",
			   "orange mango",
			   "pink nectarine",
			   "orange orange",
			   "yellow pear",
			   "green quince",
			   "red raspberry",
			   "pink strawberry",
			   "orange tangerine",
			   "green watermelon",
			   "tart apple",
			   "sweet banana",
			   "sour cherry",
			   "juicy orange",
			   "ripe peach",
			   "tropical pineapple",
			   "nutty hazelnut",
			   "spicy cinnamon",
			   "creamy coconut",
			   "buttery popcorn",
			   "crunchy granola",
			   "fluffy marshmallow",
			   "sticky caramel"
			};
	
	public PostIt() {
		
		setPrefWidth(SIZE);
		setPrefHeight(SIZE);
	    setAlignment(Pos.CENTER);
		
		int R = MAX_COLOR_VALUE + (int)(Math.random() * MIN_COLOR_VALUE);
		int G = MAX_COLOR_VALUE + (int)(Math.random() * MIN_COLOR_VALUE);
		int B = MAX_COLOR_VALUE + (int)(Math.random() * MIN_COLOR_VALUE);
				
		Color color = Color.rgb(R,G,B);
		
		setBackground(new Background(new BackgroundFill(color, null, null)));
		
		int randomNumber = 0 + (int)(Math.random() * words.length);
		
		String wordChoice = words[randomNumber];
		
		Text t = new Text();
		t.setFont(Font.font("Lucida handwriting", FontWeight.BOLD, 40 - (wordChoice.length() * 1.2)));
		t.setTextAlignment(TextAlignment.CENTER);
		t.setText(wordChoice);
	    t.setWrappingWidth(SIZE);

	    
	    getChildren().add(t);
		
	}
	
}
