//Average Forest Area
public class FAAnalysis extends Analysis {
	private Data forestArea;
	
	public FAAnalysis(Selection select) {
		super(select);
	}
	
	public void setForestArea(float[] values) {
		forestArea = new Data(this.calculateYearValues().length); //data stores as many elements as the range of years
		forestArea.setYears(this.calculateYearValues());
		forestArea.setValues(values);
	}
	
	public Data getForestArea() {
		return forestArea;
	}

}
