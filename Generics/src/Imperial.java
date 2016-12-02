
public class Imperial {

	private int inch;
	private int foot;
	private int yard;
	
	public Imperial(int inch, int foot, int yard){
		if(inch>=12){
			this.inch += inch-12*(inch/12);
			this.foot += inch/12;
		}
		else{
			this.inch += inch;
		}
		if(foot>=36){
			this.foot += foot-36*(foot/36);
			this.yard += foot/36;
		}
		else{
			this.foot += foot;
		}
		this.yard += yard;
	}
	
	public int getInch(){
		return inch;
	}
	
	public int getFoot(){
		return foot;
	}
	
	public int getYard(){
		return yard;
	}

}
