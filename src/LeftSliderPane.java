import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.util.StringConverter;

public class LeftSliderPane extends VBox {

	final int HEIGHT = 300;
	final int WIDTH = 200;
	final double MAX = 255;
	final double MIN = 0;
	
	private double RED_VALUE = 255;
	private double BLUE_VALUE = 255;
	private double GREEN_VALUE = 255;
	private Slider sliderRed;
	private Slider sliderGreen;
	private Slider sliderBlue;
	private MyScene scene;

	public LeftSliderPane(MyScene scene) {
		
		this.scene = scene;
		
		setBackground(new Background( new BackgroundFill(Color.BLUE, null, null)));
		setPrefHeight(HEIGHT);
		setPrefWidth(WIDTH);
		setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, null, null)));
		
		sliderRed = new Slider(MIN, MAX, RED_VALUE);
		sliderRed.setOrientation(Orientation.HORIZONTAL);
		sliderRed.setShowTickMarks(true);
		sliderRed.setShowTickLabels(true);
		sliderRed.setMajorTickUnit(50f);
		sliderRed.setBlockIncrement(25f);

		sliderRed.setLabelFormatter(new StringConverter<Double>() {
		    @Override
		    public String toString(Double object) {
		        if (object == 0) {
		            return "0";
		        } else if (object == 50) {
		            return "50";
		        } else if (object == 100) {
		            return "100";
		        } else if (object == 150) {
		            return "150";
		        } else if (object == 200) {
		            return "200";
		        } else if (object == 250) {
		            return "250";
		        } else if (object == 255) {
		            return "255";
		        } else {
		            return "";
		        }
		    }

		    @Override
		    public Double fromString(String string) {
		        if (string.equals("0")) {
		            return (double)0;
		        } else if (string.equals("50")) {
		            return (double) 50;
		        } else if (string.equals("100")) {
		            return (double) 100;
		        } else if (string.equals("150")) {
		            return (double) 150;
		        } else if (string.equals("200")) {
		            return (double) 200;
		        } else if (string.equals("250")) {
		            return (double) 250;
		        } else if (string.equals("255")) {
		            return (double) 255;
		        } else {
		            return null;
		        }
		    }
		});
		
		sliderBlue = new Slider(MIN, MAX, BLUE_VALUE);
		sliderBlue.setOrientation(Orientation.HORIZONTAL);
		sliderBlue.setShowTickMarks(true);
		sliderBlue.setShowTickLabels(true);
		sliderBlue.setMajorTickUnit(50f);
		sliderBlue.setBlockIncrement(25f);

		sliderBlue.setLabelFormatter(new StringConverter<Double>() {
		    @Override
		    public String toString(Double object) {
		        if (object == 0) {
		            return "0";
		        } else if (object == 50) {
		            return "50";
		        } else if (object == 100) {
		            return "100";
		        } else if (object == 150) {
		            return "150";
		        } else if (object == 200) {
		            return "200";
		        } else if (object == 250) {
		            return "250";
		        } else if (object == 255) {
		            return "255";
		        } else {
		            return "";
		        }
		    }

		    @Override
		    public Double fromString(String string) {
		        if (string.equals("0")) {
		            return (double)0;
		        } else if (string.equals("50")) {
		            return (double) 50;
		        } else if (string.equals("100")) {
		            return (double) 100;
		        } else if (string.equals("150")) {
		            return (double) 150;
		        } else if (string.equals("200")) {
		            return (double) 200;
		        } else if (string.equals("250")) {
		            return (double) 250;
		        } else if (string.equals("255")) {
		            return (double) 255;
		        } else {
		            return null;
		        }
		    }
		});
		
		sliderGreen = new Slider(MIN, MAX, GREEN_VALUE);
		sliderGreen.setOrientation(Orientation.HORIZONTAL);
		sliderGreen.setShowTickMarks(true);
		sliderGreen.setShowTickLabels(true);
		sliderGreen.setMajorTickUnit(50f);
		sliderGreen.setBlockIncrement(25f);

		sliderGreen.setLabelFormatter(new StringConverter<Double>() {
		    @Override
		    public String toString(Double object) {
		        if (object == 0) {
		            return "0";
		        } else if (object == 50) {
		            return "50";
		        } else if (object == 100) {
		            return "100";
		        } else if (object == 150) {
		            return "150";
		        } else if (object == 200) {
		            return "200";
		        } else if (object == 250) {
		            return "250";
		        } else if (object == 255) {
		            return "255";
		        } else {
		            return "";
		        }
		    }

		    @Override
		    public Double fromString(String string) {
		        if (string.equals("0")) {
		            return (double)0;
		        } else if (string.equals("50")) {
		            return (double) 50;
		        } else if (string.equals("100")) {
		            return (double) 100;
		        } else if (string.equals("150")) {
		            return (double) 150;
		        } else if (string.equals("200")) {
		            return (double) 200;
		        } else if (string.equals("250")) {
		            return (double) 250;
		        } else if (string.equals("255")) {
		            return (double) 255;
		        } else {
		            return null;
		        }
		    }
		});
		
		sliderRed.valueProperty().addListener(new RedSliderListener()); 
		sliderBlue.valueProperty().addListener(new BlueSliderListener()); 
		sliderGreen.valueProperty().addListener(new GreenSliderListener()); 
		sliderRed.valueProperty().addListener(new SliderListener()); 
		sliderBlue.valueProperty().addListener(new SliderListener()); 
		sliderGreen.valueProperty().addListener(new SliderListener()); 

		Label redLabel = new Label("Red");
		Label blueLabel = new Label("Blue");
		Label greenLabel = new Label("Green");
	
		VBox redBox = new VBox();
		redBox.getChildren().addAll(redLabel, sliderRed);
		redBox.setSpacing(10);

		VBox greenBox = new VBox();
		greenBox.getChildren().addAll(greenLabel, sliderGreen);
		greenBox.setSpacing(10);

		VBox blueBox = new VBox();
		blueBox.getChildren().addAll(blueLabel, sliderBlue);
		blueBox.setSpacing(10);
        setPadding(new Insets(10));

		getChildren().addAll(redBox, greenBox , blueBox);
		
	}
	
	public void setRandomColor() {
		
		int randomNum1 = 0 + (int)(Math.random() * 255);
		int randomNum2 = 0 + (int)(Math.random() * 255);
		int randomNum3 = 0 + (int)(Math.random() * 255);

		sliderRed.setValue(randomNum1);
		sliderGreen.setValue(randomNum2);
		sliderBlue.setValue(randomNum3);

		scene.setLeftColor(randomNum1, randomNum2, randomNum3);

	}
	
	private class RedSliderListener implements ChangeListener<Number> {
		@Override
		public void changed(ObservableValue<? extends Number> observable,  Number oldValue, Number newValue) {
			RED_VALUE = (double)newValue;
		}
	}
	
	private class BlueSliderListener implements ChangeListener<Number> {
		@Override
		public void changed(ObservableValue<? extends Number> observable,  Number oldValue, Number newValue) {
			BLUE_VALUE = (double)newValue;
		}
	}
	
	private class GreenSliderListener implements ChangeListener<Number> {
		@Override
		public void changed(ObservableValue<? extends Number> observable,  Number oldValue, Number newValue) {
			GREEN_VALUE = (double)newValue;
		}
	}
	
	private class SliderListener implements ChangeListener<Number> {
		@Override
		public void changed(ObservableValue<? extends Number> observable,  Number oldValue, Number newValue) {
			
			scene.setLeftColor((int)RED_VALUE, (int)GREEN_VALUE, (int)BLUE_VALUE);

		}
	}
	
}
