
public class HECMRFactory extends AnalysisFactory {

	public HECMRFactory(Selection select) {
		super(select);
	}
	
	public HECMRAnalysis create(Selection selection) {
		return new HECMRAnalysis(selection);
	}
}
