
public class GEECHEFactory extends AnalysisFactory {
	
	public GEECHEFactory(Selection select) {
		super(select);
	}
	
	public GEECHEAnalysis create(Selection selection) {
		return new GEECHEAnalysis(selection);
	}

}
