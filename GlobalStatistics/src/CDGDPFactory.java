
public class CDGDPFactory extends AnalysisFactory {
		
	public CDGDPFactory(Selection select) {
		super(select);
	}
		
	public CDGDPAnalysis create(Selection selection) {
		return new CDGDPAnalysis(selection);
	}


}
