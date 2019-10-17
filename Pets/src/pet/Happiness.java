package pet;
import java.io.IOException;

import constaint.Constants;

public class Happiness extends DecayLevel{

	public Happiness(double maxlevel) {
		super(maxlevel);
		try {
			Constants c = new Constants();
			setDecayRate(c.getDecayHappiness());
		} catch (IOException e) {
			e.printStackTrace();
			setDecayRate(1);
		}
	}

}
