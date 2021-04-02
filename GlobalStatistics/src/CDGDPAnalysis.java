//Ratio of CO2 emissions vs GDP
public class CDGDPAnalysis extends Analysis {
	private Data CDEmissions, GDP;
	String analysisType = "Ratio of CO2 emissions vs GDP";
	
	public CDGDPAnalysis(Selection select) {
		super(select);
	}
	
	public void setCDEmissions(float[] values) {
		CDEmissions = new Data(this.calculateYearValues().length); //data stores as many elements as the range of years
		CDEmissions.setYears(this.calculateYearValues());
		CDEmissions.setValues(values);
	}
	
	public void setGDP(float[] values) {
		GDP = new Data(this.calculateYearValues().length); //data stores as many elements as the range of years
		GDP.setYears(this.calculateYearValues());
		GDP.setValues(values);
	}
	
	public Data getCDEmissions() {
		return CDEmissions;
	}
	
	
	public Data getGDP() {
		return GDP;
	}
	
	
	
}
