package pet;
import java.io.IOException;

import constaint.Constants;

public class Thirst extends DecayLevel{

	public Thirst(double maxlevel) {
		super(maxlevel);
		try {
			Constants c = new Constants();
			setDecayRate(c.getDecayThirst());
		} catch (IOException e) {
			e.printStackTrace();
			setDecayRate(1);
		}
	}
	public void drink(double drink){
		setCurrent(getCurrent() + Math.min(Math.abs( getMax() - getCurrent()),drink));
	}

}
