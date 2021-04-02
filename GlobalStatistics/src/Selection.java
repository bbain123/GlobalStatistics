
//The selection class initializes the parameters which will be used to request data from an external database.
//It will also verify if the parameters are valid and will actually return data.
public class Selection {
	private int yearStart = 0; 
	private int yearEnd = 0;
	private String country, analysisType;
  
	public Selection(int yStart, int yEnd, String count, String aType){
		yearStart = yStart;
		yearEnd = yEnd;
		country = count;
		analysisType = aType;
	}
  
	public void setStartYear(int yStart){
		yearStart = yStart;
	}
  
	public void setEndYear(int yEnd){
		yearEnd = yEnd;
	}
  
	public void setCountry(String count){
		country = count;
	}
  
	public void setAnalysisType(String aType){
		analysisType = aType;
	}
  
	public int getStartYear(){
		return yearStart;
	}

	public int getEndYear(){
		return yearEnd;
	}

	public String getCountry(){
		return country;
  }

	public String getAnalysisType(){
		return analysisType;
  }


	public Boolean verifySelection(){ //verify that the selection we are attempting to make will produce a valid result
		if(yearStart == 0 || yearEnd == 0 || country == null || analysisType == null) //verify that inputs are not null, if any are null return false
    		return false;
   
		
		return true;
  }

}


