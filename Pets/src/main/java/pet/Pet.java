package pet;

import java.util.HashMap;

import world.Consumable;

public class Pet {
	
	private String name;
	private Hunger hunger;
	private Thirst thirst; 
	private Happiness happiness;
	private Sleep sleep;
	private BattleStats battlestats;
		
	public Pet(String petName, HashMap<String,Double> c, double maxHunger, double maxthirst, double maxHappiness, double maxSleep) {
		name = petName;
		hunger = new Hunger(maxHunger,c.get("Decay Hunger"));
		thirst = new Thirst(maxthirst,c.get("Decay Thirst"));
		happiness = new Happiness(maxHappiness,c.get("Decay Happiness"));
		sleep = new Sleep(maxSleep,c.get("Decay Sleep"));
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
		System.out.println("------------------------------------");
		System.out.println(toString());
		System.out.println(String.format("%-15s| hunger: %13.1f    thirst: %13.1f    happiness: %13.1f    sleep: %13.1f",food.getName(), food.getFood(), food.getWater(), food.getJoy(), food.getEnergy()));
		System.out.println(toString());
		System.out.println("------------------------------------");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-15s| hunger: %6.1f/%6.1f    thirst: %6.1f/%6.1f    happiness: %6.1f/%6.1f    sleep: %6.1f/%6.1f",name, hunger.getCurrent(), hunger.getMax(), thirst.getCurrent(), thirst.getMax(), happiness.getCurrent(), happiness.getMax(), sleep.getCurrent(), sleep.getMax());
	}
	
	public void hungerLU(double levelUpAmount){
		hunger.setMax(hunger.getMax() + levelUpAmount);
	}
	
	public void happinessLU(double levelUpAmount){
		happiness.setMax(happiness.getMax() + levelUpAmount);
	}

	public void thirstLU(double levelUpAmount){
		thirst.setMax(thirst.getMax() + levelUpAmount);
	}
	
	public void sleepLU(double levelUpAmount){
		sleep.setMax(sleep.getMax() + levelUpAmount);
	}
}
