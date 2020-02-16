import java.util.ArrayList;
import java.util.Random;

public class StudentPreprocessor {
	
	StudentPreprocessor() {
		
	}
	
	public static ArrayList<Student> generateStudentList(){
		ArrayList studentList = new ArrayList<Student>();
		
		return studentList;
	}
	
	public static ArrayList<String> generateRandomStudentPreferences(){
		
		ArrayList<String> preferenceList = new ArrayList<String>();
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = ;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	 
	    System.out.println(generatedString);
		
		
		return preferenceList;
	}

}
