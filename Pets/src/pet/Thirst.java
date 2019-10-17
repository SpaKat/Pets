package pet;

import java.io.IOException;

import constaint.Constants;

public class Thirst extends DecayLevel{

	public Thirst(double maxlevel) {
		super(maxlevel);
		try {
			Constants c = new Constants();
			setDecayRate(c.getDecayThrist());
		} catch (IOException e) {
			e.printStackTrace();
			setDecayRate(1);
		}
	}

}
