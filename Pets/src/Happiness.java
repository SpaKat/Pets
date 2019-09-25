import java.io.IOException;

public class Happiness {

	private double max;
	private double current;
	private double decayRate;
	public Happiness(double maxHappiness) {
		max = maxHappiness;
		current = max;
		
		try {
			Constants c = new Constants();
			decayRate = c.getDecayHappiness();
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
		System.out.println("Happiness = " + current+  "\t\t\t tick = " + (tick++));
	}
}
