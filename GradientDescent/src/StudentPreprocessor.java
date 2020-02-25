import java.util.ArrayList;
import java.util.Random;


public class StudentPreprocessor {
	
	static Integer numberOfStudents;
	//number labs, number students, init temp, rate of convergence
	//Constants c = new Constants("5", "100", "10000.00", "0.95");
	
	StudentPreprocessor() {
		
	}
	
	public static ArrayList<Student> generateStudentList(){
		
		
		ArrayList<Student> initList = new ArrayList<Student>();
		
		for (int i = 0; i < Constants.getNStudents(); i++) {
			Student s = new Student();
			s.setId(i);
			s.setRankings(StudentPreprocessor.generateRandomStudentPreferences(Constants.getNLabs()));
//			StudentPreprocessor.setStudentUtility(s, s.getId(), Constants.getNStudents(), Constants.getNLabs());
			initList.add(s);
		}
		
		return initList;
	}
//	setUtility() will be done in simulator.java
	public static ArrayList<String> generateRandomStudentPreferences(int stringLength){
		
		ArrayList<String> preferenceList = new ArrayList<String>();
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 97 + stringLength - 1; // one letter corresponds to one lab
	    int targetStringLength = stringLength;
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
