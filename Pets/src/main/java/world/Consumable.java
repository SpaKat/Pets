package world;

public class Consumable {

	private boolean rot 	= false;
	private double energy	= 0;
	private double joy 		= 0;
	private double life 	= 0;
	private double water 	= 0;
	private double food 	= 0;
	private String name		= "";

	public Consumable(String title, double hunger, double thirst, double health, double happiness, double rest, boolean rotten) {
		this(title,hunger,thirst,health,happiness,rest);
		this.rot 	= rotten;
	}
	public Consumable(String title, double hunger, double thirst, double health, double happiness, double rest) {
		this(title,hunger,thirst,health,happiness);
		this.energy = rest;
	}
	public Consumable(String title, double hunger, double thirst, double health, double happiness) {
		this(title,hunger,thirst,health);
		this.joy 	= happiness;
	}
	public Consumable(String title, double hunger, double thirst, double health) {
		this(title,hunger,thirst);
		this.life 	= health;
	}
	public Consumable(String title, double hunger, double thirst) {
		this(title,hunger);
		this.water 	= thirst;
	}
	public Consumable(String title, double hunger) {
		this.food 	= hunger;
		this.name	= title;
	}
	
	public boolean getRot() {
		return rot;
	}
	public void setRot(boolean rot) {
		this.rot = rot;
	}
	public double getEnergy() {
		return energy;
	}
	public void setEnergy(double energy) {
		this.energy = energy;
	}
	public double getJoy() {
		return joy;
	}
	public void setJoy(double joy) {
		this.joy = joy;
	}
	public double getLife() {
		return life;
	}
	public void setLife(double life) {
		this.life = life;
	}
	public double getWater() {
		return water;
	}
	public void setWater(double water) {
		this.water = water;
	}
	public double getFood() {
		return food;
	}
	public void setFood(double food) {
		this.food = food;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
