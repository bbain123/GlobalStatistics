//CO2 Emissions vs Energy use vs PM2.5 air pollution
public class CDEPMAnalysis extends Analysis {
	private Data CO2Data, energyUseData, PMData;
	private String analysisType = "CO2 Emissions vs Energy use vs PM2.5 air pollution";
	
	public CDEPMAnalysis(Selection select) {
		super(select);
	}
	
	public String getAnalysisType() {
		return analysisType;
	}

	public void setCO2Data(float[] values) {
		CO2Data = new Data(this.calculateYearValues().length); //data stores as many elements as the range of years
		CO2Data.setYears(this.calculateYearValues());
		CO2Data.setValues(values);
	}
	
	public void setEnergyUseData(float[] values) {
		energyUseData = new Data(this.calculateYearValues().length); 
		energyUseData.setYears(this.calculateYearValues());
		energyUseData.setValues(values);
	}
	
	public void setPMData(float[] values) {
		PMData = new Data(this.calculateYearValues().length); 
		PMData.setYears(this.calculateYearValues());
		PMData.setValues(values);
	}
	
	
	public Data getCO2Data() {
		return CO2Data;
	}
	
	public Data getEnergyUseData() {
		return energyUseData;
	}
	
	public Data getPMData() {
		return PMData;
	}
}
