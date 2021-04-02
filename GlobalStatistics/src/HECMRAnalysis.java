//Current health expenditure per capita vs Mortality rate
public class HECMRAnalysis extends Analysis {
	private Data healthExpendCap, mortalityRate;
	
	public HECMRAnalysis(Selection select) {
		super(select);
	}
	
	public void setHealthExpendCap(float[] values) {
		healthExpendCap = new Data(this.calculateYearValues().length); //data stores as many elements as the range of years
		healthExpendCap.setYears(this.calculateYearValues());
		healthExpendCap.setValues(values);
	}
	
	public void setMortalityRate(float[] values) {
		mortalityRate = new Data(this.calculateYearValues().length); //data stores as many elements as the range of years
		mortalityRate.setYears(this.calculateYearValues());
		mortalityRate.setValues(values);
	}
	
	public Data getHealthExpendCap() {
		return healthExpendCap;
	}
	
	public Data getMortalityRate() {
		return mortalityRate;
	}
		
}
