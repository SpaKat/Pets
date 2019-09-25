import java.io.IOException;

public class Hunger {

	private double max;
	private double current;
	private double decayRate;
	public Hunger(double maxHunger) {
		max = maxHunger;
		current = max;
		
		try {
			Constants c = new Constants();
			decayRate = c.getDecayHunger();
		} catch (IOException e) {
		
			e.printStackTrace();
			decayRate = 1;
		}
		
	}

	
	public boolean died() {
		boolean b = false;
		if (current <= 0) {
			b = true;
		}
		return b;
	}

	// one tick = 
	int tick = 0;
	public void update() {
		double min = current*decayRate;
		if (min<decayRate) {
			min = decayRate;
		}
		current -= (min);
		System.out.println("hunger = " + current+  "\t\t\t tick = " + (tick++));
	}

}
