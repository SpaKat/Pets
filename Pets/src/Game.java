import java.util.ArrayList;

public class Game {
	
	private Users users;
	
	public Game() {
		users = new Users();
	}
	
	
	public void addUser(User u) {
		users.add(u);
	}
	public void removePetFromGame(User u) {
		users.remove(u);
	}
	

}
