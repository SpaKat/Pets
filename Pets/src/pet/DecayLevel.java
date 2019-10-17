package pet;
public class DecayLevel {
	private double max;
	private double current;
	private double decayRate;
	
	public DecayLevel(double maxlevel) {
		setMax(maxlevel);
		setCurrent(getMax());
	}

	
	public boolean died() {
		boolean b = false;
		if (getCurrent() <= 0) {
			b = true;
		}
		return b;
	}

	public void update() {
		double min = getMax()*getDecayRate();
		if (min<getDecayRate()) {
			min = getDecayRate();
		}
		setCurrent(getCurrent() - (min));
	}
	
	@Override
	public String toString() {
		String s = "current over max "+String.format("%.1f",getCurrent()) + "/"+ getMax();
		return s;
	}


	public double getDecayRate() {
		return decayRate;
	}


	public void setDecayRate(double decayRate) {
		this.decayRate = decayRate;
	}


	public double getCurrent() {
		return current;
	}


	public void setCurrent(double current) {
		this.current = current;
	}


	public double getMax() {
		return max;
	}


	public void setMax(double max) {
		this.max = max;
	}
}
