package engine;

import java.util.ArrayList;

import pet.Pet;

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
	public void removeUserFromGame(User u) {
		users.remove(u);
	}
	public ArrayList<User> getUsers() {
		return users;
	}
	public User getUser(int index) {
		return users.get(index);
	}
	public Pet getPet(int userID, int petID) {
		return users.get(userID).getPet(petID);
	}

}
