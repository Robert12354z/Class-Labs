package reyes.roberto;

/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 * Description: Creates a user inputed amount of squares in the same number of rows and columns
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

public class MaddeningMatrices extends Application {
	@Override
	public void start(Stage primaryStage) {
		Random random = new Random();
		Random random2= new Random();
		GridPane gridPane = new GridPane();
		int n= getLengthOfMatrix();		
		int num =1;
		Rectangle[][] square=new Rectangle[n][n];

		for(int row=0;row<n;row++){
			for(int column=0;column<n;column++){

				int side= (int)(Math.random()*((75-25)+1)+25);
				int rotationSquare=random.nextInt(360);
				int rotationNumber=random2.nextInt(360);

				square[row][column]=new Rectangle(side, side);
				square[row][column].setFill(randColor());
				square[row][column].setRotate(rotationSquare);

				Text text=new Text(""+num);
				text.setFill(randColor());
				text.setRotate(rotationNumber);

				StackPane stackPane=new StackPane(square[row][column],text);
				gridPane.add(stackPane, column, row);
				num++;
			}
		}

		Scene scene = new Scene(gridPane);
		primaryStage.setTitle("Squares");
		primaryStage.setScene(scene); 
		primaryStage.show(); 

	}

	public Color randColor() {
		int r= (int)(Math.random()*256);
		int b= (int)(Math.random()*256);
		int g= (int)(Math.random()*256);
		double transparency= 0.25 + (1.0-0.25)*Math.random();
		Color randColor= Color.rgb(r,g,b,transparency);
		return randColor;
	}

	public int getLengthOfMatrix() {
		TextInputDialog input = new TextInputDialog("Enter an integer");
		input.setHeaderText("Numbers of Row & Columns");
		input.showAndWait();
		int n = Integer.parseInt(input.getEditor().getText());

		return n;
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
