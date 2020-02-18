
public class Constants {
	
	private static String NUMBEROFLABS;
	private static String TEMPERATURE;
	private static String NUMBEROFSTUDENTS;
	private static String LEARNINGRATE;
	Constants(String nLabs, String nStudents, String Temperature, String LearningRate){
		Constants.NUMBEROFLABS = nLabs;
		Constants.NUMBEROFSTUDENTS = nStudents;
		Constants.TEMPERATURE = Temperature;
		Constants.LEARNINGRATE = LearningRate;
	}
	
	public static int getNLabs() {
		return Integer.parseInt(NUMBEROFLABS);
	}
	
	public static int getNStudents() {
		return Integer.parseInt(NUMBEROFSTUDENTS);
	}
	public static double getTemp() {
		return Double.parseDouble(TEMPERATURE);
	}
	public static  double getLearningRate() {
		return Double.parseDouble(LEARNINGRATE);
	}

}
