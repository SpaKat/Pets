package localGraphics;

import java.util.ArrayList;

import engine.User;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import pet.Pet;

public class PetSprites {
	
	private Circle[][] sprites;
	
	public PetSprites(ArrayList<User> users, int maxPets) {
		sprites = new Circle[users.size()][maxPets];
		int i = 0;
		int j = 0;
		for(User u:users) {
			for(Pet p:u.getPets()) {
				Circle temp = new Circle();
				temp.setStroke(Color.RED);
				temp.setFill(new ImagePattern(new Image("File://..//src//main//resources//testPet.png")));
				temp.setRadius(32);
				temp.setTranslateX(100);
				temp.setTranslateY(100);
				sprites[i][j]=temp;
				j++;
			}
			i++;
		}
	}

	public Circle[][] getSprites() {
		return sprites;
	}
	
}
