import pet.Pet;

public class User {

	private Pets pets;
	//private boolean connected; 
	
	public User() {
		pets = new Pets();		
	}
	
	
	public void addPetToGame(Pet p) {
		pets.add(p);
	}
	public void removePetFromGame(Pet p) {
		pets.remove(p);
	}
	

	
}
