package engine;

import java.util.ArrayList;

import pet.Pet;

// Goal of the class is to manage the rules of the pets (tamagotchi)
public class Engine extends Thread{

	private ArrayList<User> users;
	private boolean running;
	private long updateTime = 1000; // in millis
	
	public Engine(ArrayList<User> users) {
		this.users = users;
		running = true;
	}
	public Engine(ArrayList<User> users, long updateTime) {
		this(users);
		this.updateTime = updateTime;
	}
	
	
	@Override
	public void run() {
		while (running) {
			updatePets();
			updateWait();
		}
	}
	
	private void updatePets() {
		User[] usersArray = users.toArray(new User[1]);
		for (int i = 0; i < usersArray.length; i++) {
			Pet[] pets = usersArray[i].getPets().toArray(new Pet[1]);
			for (int j = 0; j < pets.length; j++) {
				pets[j].update();
				System.out.println(pets[j].toString());
			}
		}
	}
	private void updateWait() {
		try {
			Thread.sleep(updateTime);
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
	}
	public void end() {
		running = false;
	}
}
