package pet;
import java.io.IOException;

import constaint.Constants;

public class Hunger extends DecayLevel{

	
	public Hunger(double maxLevel) {
		super(maxLevel);
		try {
			Constants c = new Constants();
			setDecayRate(c.getDecayHunger());
		} catch (IOException e) {
			e.printStackTrace();
			setDecayRate(1);
		}
	}

	public void eat(double food) {
		setCurrent(getCurrent() + Math.min(Math.abs( getMax() - getCurrent()),food));
	}

}
