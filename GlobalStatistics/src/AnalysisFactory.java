
public class AnalysisFactory {
	private Selection selection;
	
	public AnalysisFactory(Selection select) {
		selection = select;
	}
	
	public Analysis create(Selection selection) {
		if(selection.getAnalysisType().equals("AGEE"))
			return new AGEEFactory(selection).create(selection);
		
		else if(selection.getAnalysisType().equals("CDEPM"))
			return new CDEPMFactory(selection).create(selection);
		
		else if(selection.getAnalysisType().equals("CDGDP"))
			return new CDGDPFactory(selection).create(selection);
		
		else if(selection.getAnalysisType().equals("FA"))
			return new FAFactory(selection).create(selection);
		
		else if(selection.getAnalysisType().equals("GEECHE"))
			return new GEECHEFactory(selection).create(selection);
		
		else if(selection.getAnalysisType().equals("HBHE"))
			return new HBHEFactory(selection).create(selection);
		
		else if(selection.getAnalysisType().equals("HECMR"))
			return new HECMRFactory(selection).create(selection);
		
		else if(selection.getAnalysisType().equals("PMFA"))
			return new PMFAFactory(selection).create(selection);
		
		return null; //cannot be anything other than one of the selections	
	}
}
