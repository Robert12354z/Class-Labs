package reyes.roberto;

/* Name: Roberto Reyes
 * CIN: 307806805
 * Course & Section: CS2012 Sections 01 & 02 
 * Description: Creates an image of the devil himself, TOM NOOK.
 */

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ScenesFromAComputer extends Application {

	@Override
	public void start(Stage primaryStage){

		Ellipse ellipse = new Ellipse(500.0,350.0,300.0,270.0);
		ellipse.setFill(Color.SADDLEBROWN);
		ellipse.setStroke(Color.BLACK);
		
		Ellipse ellipse2 = new Ellipse(500.0,280.0,230.0,120.0);
		ellipse2.setFill(Color.rgb(69,35,8));
		ellipse2.setStroke(Color.BLACK);

		Circle ear1 = new Circle(290,150,100,Color.SADDLEBROWN);
		ear1.setStroke(Color.BLACK);
		Circle innerEar2= new Circle(290,150,50,Color.PINK);
		innerEar2.setStroke(Color.BLACK);
		
		Circle ear2 = new Circle(700,150,100,Color.SADDLEBROWN);
		Circle innerEar3= new Circle(700,150,50,Color.PINK);
		ear2.setStroke(Color.BLACK);
		innerEar3.setStroke(Color.BLACK);

		Ellipse eyeball1 = new Ellipse(390,280,50,80);
		eyeball1.setFill(Color.WHITE);
		eyeball1.setStroke(Color.BLACK);
		Ellipse eyeball2 = new Ellipse(610,280,50,80);
		eyeball2.setFill(Color.WHITE);
		eyeball2.setStroke(Color.BLACK);
		
		Ellipse innerEyeball1 = new Ellipse(390,280,25,45);
		innerEyeball1.setFill(Color.SKYBLUE);
		innerEyeball1.setStroke(Color.BLACK);
			
		Ellipse innerEyeball2 = new Ellipse(610,280,25,45);
		innerEyeball2.setFill(Color.SKYBLUE);
		innerEyeball2.setStroke(Color.BLACK);
		
		Ellipse nose= new Ellipse(500,450,50,30);
		nose.setFill(Color.rgb(69,35,8));
		nose.setStroke(Color.BLACK);

		Circle circle1 = new Circle(500,350,450);
		circle1.setFill(randColor());
		
		Circle circle2= new Circle(500,350,380);
		circle2.setFill(Color.WHITE);
		
		Line line1= new Line(250,50,750,650);
		line1.setStrokeWidth(50.0);
		line1.setStroke(randColor());

		Rectangle background = new Rectangle(100000,1000000);
		background.setFill(randColor());
		
		Pane pane = new Pane();
		pane.getChildren().addAll(background,circle1,circle2,ear1,innerEar2,ear2,innerEar3,ellipse,ellipse2,eyeball1,
				eyeball2,innerEyeball1,innerEyeball2,nose,line1);
		Text t = new Text(850,650,"Roberto Reyes");
		t.setFont(Font.font("ComicSans",15));
		t.setFill(Color.WHITE);
		pane.getChildren().add(t);
		Scene scene = new Scene(pane,1000,1000);
		primaryStage.setTitle("BAN TOM NOOK"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 

	}

	public Color randColor() {
		int r= (int)(Math.random()*256);
		int b= (int)(Math.random()*256);
		int g= (int)(Math.random()*256);
		Color randColor= Color.rgb(r,g,b,1.0);
		return randColor;
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}

