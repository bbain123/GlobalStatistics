//(Ratio of Hospital beds vs Current health expenditure)
public class HBHEAnalysis extends Analysis {
	private Data hospBeds, heathExpend;
	
	public HBHEAnalysis(Selection select) {
		super(select);
	}
	
	public void setHospBeds(float[] values) {
		hospBeds = new Data(this.calculateYearValues().length); //data stores as many elements as the range of years
		hospBeds.setYears(this.calculateYearValues());
		hospBeds.setValues(values);
	}
	
	public void setHealthExpend(float[] values) {
		heathExpend = new Data(this.calculateYearValues().length); //data stores as many elements as the range of years
		heathExpend.setYears(this.calculateYearValues());
		heathExpend.setValues(values);
	}
	
	
	public Data getHospBeds() {
		return hospBeds;
	}
	
	public Data getHeathExpend() {
		return heathExpend;
	}
	
}