package localGraphics;

import java.io.IOException;
import java.util.HashMap;

import constaint.Constants;
import engine.Game;
import engine.User;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import pet.Pet;

public class PetGUI extends Application {

	private static final String HEIGHT 	= "Height";
	private static final String WIDTH 	= "Width";
	private static final String MAXPPU 	= "Max Pets Per User";
	
	
	private Pane root;
	private Scene scene1;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c = new HashMap<String,Double>();
		c = consts.getCONSTANTS();
		
		game 	= new Game();
		user1 	= new User();
		user1.addPetToGame(new Pet("Alfred", c, 500, 500, 500, 500));
		game.addUser(user1);
		sprites = new PetSprites(game.getUsers(), c.get(MAXPPU).intValue());
		spr = sprites.getSprites();
		
		for(Circle[] a:spr) {
			for(Circle b:a) {
				if(b!=null) {
					root.getChildren().add(b);
				}
			}
		}
		
		
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		root.setPrefSize(c.get(WIDTH), c.get(HEIGHT));
		primaryStage.setScene(scene1);
		primaryStage.setTitle("LabPets");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
