package localGraphics;

import java.io.IOException;
import java.util.HashMap;

import constaint.Constants;
import engine.Game;
import engine.User;
import javafx.application.Application;
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
		petPrint = new Label("");
		feed = new Button("FEED");
		try {
			consts = new Constants();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c = new HashMap<String,Double>();
		c = consts.getCONSTANTS();
		
		petPrint.setTranslateX(10);
		petPrint.setTranslateY(30);
		
		feed.setTranslateX(600);
		feed.setTranslateY(30);
		
		game 	= new Game();
		user1 	= new User();
		user1.addPetToGame(new Pet("Alfred", c, 500, 500, 500, 500));
		game.addUser(user1);
		sprites = new PetSprites(game.getUsers(), c.get(MAXPPU).intValue());
		spr = sprites.getSprites();
		int i = 0;
		int j = 0;
		for(Circle[] a:spr) {
			for(Circle b:a) {
				if(b!=null) {
					root.getChildren().add(b);
					///UPDATE TO GET SPECIFIC USER FROM GAME AND USER
					petPrint.setText(game.getUsers().get(i).getPets().get(j).toString());
				}
				j++;
			}
			i++;
		}
		
		feed.setOnMouseReleased(e -> {
			Pet temp = game.getUsers().get(0).getPets().get(0);
			temp.consume(new Consumable("Apple", 2, 2, 2, 2, 2, false));
			temp.hungerLU(200);
			petPrint.setText(temp.toString());
		});
		
		root.getChildren().add(petPrint);
		root.getChildren().add(feed);
		
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
