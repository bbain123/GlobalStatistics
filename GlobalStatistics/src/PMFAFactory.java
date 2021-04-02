
public class PMFAFactory extends AnalysisFactory{

	public PMFAFactory(Selection select) {
		super(select);
	}
	
	public PMFAAnalysis create(Selection selection) {
		return new PMFAAnalysis(selection);
	}
}
