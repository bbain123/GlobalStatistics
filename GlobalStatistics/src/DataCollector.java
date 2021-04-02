
public class DataCollector {

	public DataCollector() {
	}
	
	public Analysis populateAnalysis(Analysis analysis) {
		GetData getdata = new GetData();
		
		if(analysis instanceof AGEEAnalysis) {
			AGEEAnalysis returnAGEE = new AGEEAnalysis(analysis.getSelection());
			returnAGEE.setGovExpendEdu(getdata.getValues(returnAGEE, "SE.XPD.TOTL.GD.ZS"));
			return returnAGEE;
		}
		
		else if(analysis instanceof CDEPMAnalysis) {
	        CDEPMAnalysis returnCDEPM = new CDEPMAnalysis(analysis.getSelection());
	        returnCDEPM.setCO2Data(getdata.getValues(returnCDEPM, "EN.ATM.CO2E.PC"));
	        returnCDEPM.setEnergyUseData(getdata.getValues(returnCDEPM, "EG.USE.PCAP.KG.OE"));
	        returnCDEPM.setPMData(getdata.getValues(returnCDEPM, "EN.ATM.PM25.MC.M3"));
	        return returnCDEPM;
		}
		
		else if(analysis instanceof CDGDPAnalysis) {
	        CDGDPAnalysis returnCDGDP = new CDGDPAnalysis(analysis.getSelection());
	        returnCDGDP.setCDEmissions(getdata.getValues(returnCDGDP, "EN.ATM.CO2E.PC"));
	        returnCDGDP.setGDP(getdata.getValues(returnCDGDP, "NY.GDP.PCAP.CD"));
	        return returnCDGDP;
	    }
		
		
		else if(analysis instanceof FAAnalysis) {
            FAAnalysis returnFA = new FAAnalysis(analysis.getSelection());
            returnFA.setForestArea(getdata.getValues(returnFA, "AG.LND.FRST.ZS"));
            return returnFA;
        }
		
		else if(analysis instanceof GEECHEAnalysis ) {
            GEECHEAnalysis returnGEECHE = new GEECHEAnalysis(analysis.getSelection());
            returnGEECHE.setGovExpend(getdata.getValues(returnGEECHE, "SE.XPD.TOTL.GD.ZS"));
            returnGEECHE.setHealthExpend(getdata.getValues(returnGEECHE, "SH.XPD.CHEX.GD.ZS"));
            return returnGEECHE;
        }
		
		else if(analysis instanceof HBHEAnalysis) {
		    HBHEAnalysis returnHBHE = new HBHEAnalysis(analysis.getSelection());
		    returnHBHE.setHospBeds(getdata.getValues(returnHBHE, "SH.MED.BED.ZS"));
		    returnHBHE.setHealthExpend(getdata.getValues(returnHBHE, "SH.XPD.CHEX.GD.ZS"));
		    return returnHBHE;
		}
		
		else if (analysis instanceof HECMRAnalysis) {
			HECMRAnalysis returnHECMR = new HECMRAnalysis(analysis.getSelection());
			returnHECMR.setHealthExpendCap(getdata.getValues(returnHECMR, "SH.XPD.CHEX.PC.CD"));
			returnHECMR.setMortalityRate(getdata.getValues(returnHECMR, "SP.DYN.IMRT.IN"));
			return returnHECMR;
		}
		
		else if(analysis instanceof PMFAAnalysis ) {
            PMFAAnalysis returnPMFA = new PMFAAnalysis(analysis.getSelection());
            returnPMFA.setPMPollution(getdata.getValues(returnPMFA, "EN.ATM.PM25.MC.M3"));
            returnPMFA.setForestArea(getdata.getValues(returnPMFA, "AG.LND.FRST.ZS"));
            return returnPMFA;
        }
		
		
		
		
		return null;
			
		
	}
	
	
}
