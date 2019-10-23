package engine;

import java.util.ArrayList;

public class Game {
	
	private ArrayList<User> users;
	private Engine engine;
	
	public Game() {
		users = new ArrayList<>();
		engine = new Engine(users);
	}
	public Game(long updateTime) {
		users = new ArrayList<>();
		engine = new Engine(users,updateTime);
	}
	public void begin() {
		engine.start();
	}
	public void end() {
		engine.end();
		engine.interrupt();
	}
	public void addUser(User u) {
		users.add(u);
	}
	public void removePetFromGame(User u) {
		users.remove(u);
	}
	

}
