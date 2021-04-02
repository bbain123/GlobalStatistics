import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class GetData {

	
	public float[] getValues(Analysis analysis, String analysisCode) {

		int valueForYear = 0;
		int range = analysis.getSelection().getEndYear() - analysis.getSelection().getStartYear() + 1;
		float[] values = new float[range];
		
		
		String urlString = String.format(
				"http://api.worldbank.org/v2/country/" + analysis.getSelection().getCountry() +"/indicator/"+ 
				analysisCode +"?date="+ analysis.getSelection().getStartYear() + ":"+ analysis.getSelection().getEndYear() +"&format=json");
		//System.out.println(urlString);
		
		
		try {
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int responsecode = conn.getResponseCode();
			if (responsecode == 200) {
				String inline = "";
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					inline += sc.nextLine();
				}
				sc.close();
				JsonArray jsonArray = JsonParser.parseString(inline).getAsJsonArray();
				int size = jsonArray.size();
				int sizeOfResults = jsonArray.get(1).getAsJsonArray().size();
				int year;
				for (int i = 0; i < sizeOfResults; i++) {
					year = jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
					if (jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull())
						valueForYear = 0;
					else
						valueForYear = jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value")
								.getAsInt();

					System.out.println("Population for : " + year + " is " + valueForYear +" and i = " + i);
					values[i] = valueForYear;
					
				}
				System.out.println(
						"The average population over the selected years is NEVERMIND" );
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block e.printStackTrace();
		}

		return null;
	}
	

}


