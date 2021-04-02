
public class Data {
	private int[] years;
	private float[] values;
	
	//sets arrays to the size of data elements
	public Data(int range) {
		years = new int[range];
		values = new float[range];
	}
	
	public void setYears(int[] yrs) {
		years = yrs;
	}
	
	public void setValues(float[] vls) {
		values = vls;
	}
	
	public int[] getYears() {
		return years;
	}
	
	public float[] getValues() {
		return values;
	}
	
}
