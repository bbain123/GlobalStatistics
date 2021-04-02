//Average of Government expenditure on education
public class AGEEAnalysis extends Analysis{
	private Data govExpendEdu;
	
	
	public AGEEAnalysis(Selection select) {
		super(select);
		setAnalysisType("Average of Government expenditure on education");
	}
	
	
	public void setGovExpendEdu(float[] values) {
		govExpendEdu = new Data(this.calculateYearValues().length); //data stores as many elements as the range of years
		govExpendEdu.setYears(this.calculateYearValues());
		govExpendEdu.setValues(values);
	}
	
	public Data getGovExpendEdu() {
		return govExpendEdu;
	}
	
	
}
