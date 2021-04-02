
public class Analysis {
	private Selection selection;
	private String analysisType;
	
	public Analysis(Selection select) {
		selection = select;
	}
	
	public String getAnalysisType() {
		return analysisType;
	}
	
	public void setAnalysisType(String s) {
		analysisType = s;
	}
	
	public Selection getSelection() {
		return selection;
	}
	
	public int[] calculateYearValues() {
		int[] product = new int[selection.getEndYear() - selection.getStartYear() + 1];
		
		for(int i = selection.getEndYear(); i >= selection.getStartYear(); i--) { //stores years from End date to start date
			product[i - selection.getEndYear()] = i; 
		}
		
		return product;
	}
	
}
