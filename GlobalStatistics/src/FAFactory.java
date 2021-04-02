
public class FAFactory extends AnalysisFactory {
	
	public FAFactory(Selection select) {
		super(select);
	}
	
	public FAAnalysis create(Selection selection) {
		return new FAAnalysis(selection);
	}

}
