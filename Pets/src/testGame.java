import engine.Game;
import engine.User;
import pet.Pet;

public class testGame {

	public static void main(String[] args) {
		Game game = new Game(50);

		User user1 = new User();
		Pet pet11 = new Pet(500, 500, 500, 500);
		Pet pet12 = new Pet(500, 500, 500, 500);

		user1.addPetToGame(pet11);
		user1.addPetToGame(pet12);
		
		User user2 = new User();
		Pet pet21 = new Pet(100, 100, 100, 100);
		Pet pet22 = new Pet(100, 100, 100, 100);
		
		user2.addPetToGame(pet22);
		user2.addPetToGame(pet21);
		
		
		game.addUser(user1);
		game.addUser(user2);
		
		game.begin();

		try {
			Thread.sleep(92000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		game.end();
		
	}

}
