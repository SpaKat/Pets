package pet;

import world.Consumable;

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
	
	public void consume(Consumable food){
		hunger.eat(food.getRot() ? -food.getFood() : food.getFood());
		thirst.drink(food.getWater());
		happiness.fun(food.getJoy());
		sleep.rest(food.getEnergy());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%.1f | %.1f | %.1f | %.1f", hunger.getCurrent(), thirst.getCurrent(), happiness.getCurrent(), sleep.getCurrent());
	}
	

}
