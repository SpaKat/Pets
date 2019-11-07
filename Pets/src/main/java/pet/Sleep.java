package pet;

import java.io.IOException;
import constaint.Constants;

public class Sleep extends DecayLevel {

	public Sleep(double maxlevel, double decay) {
		super(maxlevel, decay);
	}

	/*public Sleep(double maxlevel) {
		super(maxlevel);
		try {
			Constants c = new Constants();
			setDecayRate(c.getDecaySleep());
		} catch (IOException e) {
			e.printStackTrace();
			setDecayRate(1);
		}
	}*/
	
	public void rest(double energy){
		setCurrent(getCurrent() + Math.min(Math.abs( getMax() - getCurrent()),energy));
	}
}
