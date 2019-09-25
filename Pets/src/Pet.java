
public class Pet {
	
	private Hunger hunger;
	private Happiness happiness;
	private WellBeing wellbeing;
	
	
	public Pet(double maxHunger, double maxHappiness) {
		hunger = new Hunger(maxHunger);
		happiness = new Happiness(maxHappiness);
		wellbeing = new WellBeing();
	}
	
	public void update() {
		hunger.update();
		happiness.update();
	}
	
	public boolean died() {
		boolean ans = false;
		if(hunger.died() || wellbeing.died()) {
			ans = true;
		}
		return ans;
	}
	


}
