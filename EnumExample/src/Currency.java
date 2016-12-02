
public enum Currency {
	PENNY(0.01),
	NICKLE(0.05),
	DIME(0.25),
	QUARTER(0.5);
	
	private final double value;
	Currency(double value){
		this.value = value;
	}
	public double getValue(){
		return value;
	}
}

