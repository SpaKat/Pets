package engine;
import java.util.ArrayList;

import pet.Pet;

public class User {

	private ArrayList<Pet> pets;
	
	public User() {
		pets = new ArrayList<>();		
	}
	
	public void addPetToGame(Pet p) {
		pets.add(p);
	}
	public void removePetFromGame(Pet p) {
		pets.remove(p);
	}
	public ArrayList<Pet> getPets() {
		return pets;
	}
}
