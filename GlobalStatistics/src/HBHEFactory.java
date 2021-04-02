
public class HBHEFactory extends AnalysisFactory {
	
	public HBHEFactory(Selection select) {
		super(select);
	}
	
	public HBHEAnalysis create(Selection selection) {
		return new HBHEAnalysis(selection); 
	}

}
