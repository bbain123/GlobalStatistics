
public class ComputationalServer{
	private ComputationalServer computationalServer = null;
	private Selection userSelection;
	private Analysis results;
	private DataCollector collector;

  
	private ComputationalServer getInstance(Selection select){
  		if(computationalServer == null)
  			computationalServer = new ComputationalServer(select);
    
    	return computationalServer;
	}
  
	private ComputationalServer(Selection select){ //call all methods of ComputationalServer here
		userSelection = select;
		results = new AnalysisFactory(userSelection).create(userSelection);
		
	}
	
	public void doSelection(Analysis analysis) {
		 results = new DataCollector().populateAnalysis(analysis); //final populated result								 
	}
	
	public Analysis getResults() {
		return results;
	}
	
	public boolean verify() {
		String country = userSelection.getCountry();
		int endYear = userSelection.getEndYear();
		int startYear = userSelection.getStartYear();
		
		if(country.equals("USA")){
			if((endYear >= 1981) && (endYear <= 2021) && (startYear >= 1981) && (startYear <= 2021) && (startYear >= endYear))
				return true;
			else
				return false;
		}
		
		else if(country.equals("ITA")){
			if((endYear >= 1962) && (endYear <= 2021) && (startYear >= 1962) && (startYear <= 2021) && (startYear >= endYear))
				return true;
			else
				return false;
		}
		
		else if(country.equals("UGA")){
			if((endYear >= 1962) && (endYear <= 2021) && (startYear >= 1962) && (startYear <= 2021) && (startYear >= endYear))
				return true;
			else
				return false;
		}
		
		else if(country.equals("IND")){
	        if((endYear >= 1975) && (endYear <= 2021) && (startYear >= 1975) && (startYear <= 2021) && (startYear >= endYear))
	            return true;
	        else
	            return false;
	    }
		
		else if(country.equals("JPN")){
	        if((endYear >= 1962) && (endYear <= 2021) && (startYear >= 1962) && (startYear <= 2021) && (startYear >= endYear))
	            return true;
	        else
	            return false;
	    }
		
		else if(country.equals("CHN")){
	        if((endYear >= 1962) && (endYear <= 2021) && (startYear >= 1962) && (startYear <= 2021) && (startYear >= endYear))
	            return true;
	        else
	            return false;
	    }
		
		else if(country.equals("BRA")){
	        if((endYear >= 1962) && (endYear <= 2021) && (startYear >= 1962) && (startYear <= 2021) && (startYear >= endYear))
	            return true;
	        else
	            return false;
	    }
		
		else if(country.equals("CAN")){
            if((endYear >= 1962) && (endYear <= 2021) && (startYear >= 1962) && (startYear <= 2021) && (startYear >= endYear))
                return true;
            else
                return false;
        }
		
		else if(country.equals("FRA")){
            if((endYear >= 1962) && (endYear <= 2021) && (startYear >= 1962) && (startYear <= 2021) && (startYear >= endYear))
                return true;
            else
                return false;
        }
		
		else
			return false;
		
		
		
	}
	
  
  	 
}