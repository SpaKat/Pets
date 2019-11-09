package localGraphics;

import java.io.IOException;
import java.util.HashMap;

import constaint.Constants;
import engine.Game;
import engine.User;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import pet.Pet;
import world.Consumable;

public class PetGUI extends Application {

	private static final String HEIGHT 	= "Height";
	private static final String WIDTH 	= "Width";
	private static final String MAXPPU 	= "Max Pets Per User";
	
	
	private Pane root;
	private Scene scene1;
	private Label petPrint;
	private Button feed;
	private Constants consts;
	private HashMap<String,Double> c;
	private Game game;
	private User user1;
	private PetSprites sprites;
	private Circle[][] spr;
	
	
	public PetGUI() {
		root = new Pane();
		scene1 = new Scene(root);
		try {
			consts = new Constants();
		} catch (IOException e) {
			//e.printStackTrace();
		}
		c = new HashMap<String,Double>();
		c = consts.getCONSTANTS();
		
		//Label Properties
		petPrint = new Label("");
		petPrint.setTranslateX(10);
		petPrint.setTranslateY(30);
		
		//button Properties
		feed = new Button("FEED");
		feed.setTranslateX(600);
		feed.setTranslateY(30);
		
		//game info
		game 	= new Game(50);
		user1 	= new User();
		user1.addPetToGame(new Pet("Alfred", c, 500, 500, 500, 500));
		game.addUser(user1);
		game.begin();
		
		//making sprites to represent pets
		sprites = new PetSprites(game.getUsers(), c.get(MAXPPU).intValue());
		spr = sprites.getSprites();
		
		//button events
		feed.setOnMouseReleased(e -> {
			Pet temp = game.getPet(0,0);
			temp.consume(new Consumable("Apple", 2, 2, 2, 2, 2, false));
			temp.hungerLU(200);
			petPrint.setText(temp.toString());
		});
		
		//add objects to the pane
		int i = 0;
		int j = 0;
		for(Circle[] a:spr) {
			for(Circle b:a) {
				if(b!=null) {
					root.getChildren().add(b);
					petPrint.setText(game.getPet(i,j).toString());
				}
				j++;
			}
			i++;
		}
		root.getChildren().add(petPrint);
		root.getChildren().add(feed);
		
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		//setting preferences for the scene
		root.setPrefSize(c.get(WIDTH), c.get(HEIGHT));
		primaryStage.setScene(scene1);
		primaryStage.setTitle("LabPets");
		primaryStage.setOnCloseRequest(e -> {
			Platform.exit();
			game.end();
		});
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
