//Ratio of Government expenditure on education vs Current health expenditure
public class GEECHEAnalysis extends Analysis {
	private Data govExpend, healthExpend;
	String 
	
	public GEECHEAnalysis(Selection select) {
		super(select);
	}
	
	public void setGovExpend(float[] values) {
		govExpend = new Data(this.calculateYearValues().length); //data stores as many elements as the range of years
		govExpend.setYears(this.calculateYearValues());
		govExpend.setValues(values);
	}
	
	public void setHealthExpend(float[] values) {
		healthExpend = new Data(this.calculateYearValues().length); //data stores as many elements as the range of years
		healthExpend.setYears(this.calculateYearValues());
		healthExpend.setValues(values);
	}
	
	public Data getGovExpend() {
		return govExpend;
	}
	
	public Data getHealthExpend() {
		return healthExpend;
	}
	
	
}
