
public class AGEEFactory extends AnalysisFactory {
	
	public AGEEFactory(Selection select) {
		super(select);
	}
	
	public AGEEAnalysis create(Selection selection) {
		return new AGEEAnalysis(selection);
	}

}
