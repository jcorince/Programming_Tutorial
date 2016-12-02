
public class Metric {

	private int centimeter;
	private int meter;
	private int kilometer;
	
	public Metric(int centimeter, int meter, int kilometer){
		if(centimeter>=100){
			this.centimeter += centimeter - 100 * (centimeter/100);
			this.meter += centimeter/100;
		}
		else{
			this.centimeter += centimeter;
		}
		if(meter>=1000){
			this.meter += meter - 1000 * (meter/1000);
			this.kilometer += meter/1000;
		}
		else{
			this.meter += meter;
		}
		this.kilometer += kilometer;
	}
	
	public int getCentimeter(){
		return centimeter;
	}
	
	public int getMeter(){
		return meter;
	}
	
	public int getKilometer(){
		return kilometer;
	}

}
