import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.control.Slider;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.util.StringConverter;

public class SliderPane extends Pane {

	final int HEIGHT = 200;
	final int WIDTH = 120;
	final double MAX = 1.5;
	final double MIN = 0.5;
	final double VALUE = 1;
	private ControlPane controlPane;

	private Slider slider;

	public SliderPane(ControlPane controlPane) {

		this.controlPane = controlPane;

		setPrefHeight(HEIGHT);
		setPrefWidth(WIDTH);
		setBackground(new Background(new BackgroundFill(Color.WHEAT, null, null)));
		slider = new Slider(MIN, MAX, VALUE);
		slider.setOrientation(Orientation.VERTICAL);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(0.5f);
		slider.setBlockIncrement(0.1f);

		slider.setLabelFormatter(new StringConverter<Double>() {
		    @Override
		    public String toString(Double object) {
		        if (object == 0.5) {
		            return "-50%";
		        } else if (object == 1) {
		            return "0%";
		        } else if (object == 1.5) {
		            return "+50%";
		        } else {
		            return "";
		        }
		    }

		    @Override
		    public Double fromString(String string) {
		        if (string.equals("-50%")) {
		            return 0.5;
		        } else if (string.equals("0%")) {
		            return (double) 1;
		        } else if (string.equals("+50%")) {
		            return 1.5;
		        } else {
		            return null;
		        }
		    }
		});
		
		slider.valueProperty().addListener(new MySliderListener()); 

		getChildren().add(slider);
	}
	
	private class MySliderListener implements ChangeListener<Number> {
		@Override
		public void changed(ObservableValue<? extends Number> observable,  Number oldValue, Number newValue) {
			controlPane.setScaling(newValue.doubleValue());  
			
		}
	}

}
