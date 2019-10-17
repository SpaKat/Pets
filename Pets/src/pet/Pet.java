package pet;

import world.Food;

public class Pet {
	
	private Hunger hunger;
	private Thirst thirst; 
	private Happiness happiness;
	private Sleep sleep;
	private BattleStats battlestats;
		
	public Pet(double maxHunger, double maxthirst, double maxHappiness, double maxSleep) {
		hunger = new Hunger(maxHunger);
		thirst = new Thirst(maxthirst);
		happiness = new Happiness(maxHappiness);
		sleep = new Sleep(maxSleep);
	}
	
	public void update() {
		hunger.update();
		thirst.update();
		happiness.update();
		sleep.update();
	}
	
	public boolean died() {
		boolean ans = false;
		if(hunger.died() || thirst.died() || sleep.died() || thirst.died()) {
			ans = true;
		}
		return ans;
	}
	public void eat(Food food) {
		hunger.eat(food.getValue());	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hunger.toString();
	}
	

}
