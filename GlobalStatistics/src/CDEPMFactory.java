
public class CDEPMFactory extends AnalysisFactory {
	
	public CDEPMFactory(Selection select) {
		super(select);
	}
	
	public CDEPMAnalysis create(Selection selection) {
		return new CDEPMAnalysis(selection);
	}

}
