//PM2.5 pollution vs Forest Area
public class PMFAAnalysis extends Analysis {
	private Data PMPollution, forestArea;
	
	public PMFAAnalysis(Selection select) {
		super(select);
	}
	
	public void setPMPollution(float[] values) {
		PMPollution = new Data(this.calculateYearValues().length); //data stores as many elements as the range of years
		PMPollution.setYears(this.calculateYearValues());
		PMPollution.setValues(values);
	}
	
	public void setForestArea(float[] values) {
		forestArea = new Data(this.calculateYearValues().length); //data stores as many elements as the range of years
		forestArea.setYears(this.calculateYearValues());
		forestArea.setValues(values);
	}
	
	public Data getPMPollution() {
		return PMPollution;
	}
	
	public Data getForestArea() {
		return forestArea;
	}
	
}
