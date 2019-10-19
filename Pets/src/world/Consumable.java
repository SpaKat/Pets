package world;

public class Consumable {

	private boolean rot 	= false;
	private double energy	= 0;
	private double joy 		= 0;
	private double life 	= 0;
	private double water 	= 0;
	private double food 	= 0;

	public Consumable(double hunger, double thirst, double health, double happiness, double rest, boolean rotten) {
		this.rot 	= rotten;
		this.energy = rest;
		this.joy 	= happiness;
		this.life 	= health;
		this.water 	= thirst;
		this.food 	= hunger;
	}
	public Consumable(double hunger, double thirst, double health, double happiness, double rest) {
		this.energy = rest;
		this.joy 	= happiness;
		this.life 	= health;
		this.water 	= thirst;
		this.food 	= hunger;
	}
	public Consumable(double hunger, double thirst, double health, double happiness) {
		this.joy 	= happiness;
		this.life 	= health;
		this.water 	= thirst;
		this.food 	= hunger;
	}
	public Consumable(double hunger, double thirst, double health) {
		this.life 	= health;
		this.water 	= thirst;
		this.food 	= hunger;
	}
	public Consumable(double hunger, double thirst) {
		this.water 	= thirst;
		this.food 	= hunger;
	}
	public Consumable(double hunger) {
		this.food 	= hunger;
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

}
