import java.util.ArrayList;

public class Student {
	
	private Integer id;
	private ArrayList<String> rankings;
	public short utility = 0;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ArrayList<String> getRankings() {
		return rankings;
	}
	public void setRankings(ArrayList<String> rankings) {
		this.rankings = rankings;
	}
	public short getUtility() {
		
		return utility;
	}
	public void setUtility(int indexInShuffledArray) {
		
		
		
		this.utility = utility;
	}
	
//	public static void main(String args[]) {
////		sample student
//		Student s = new Student();
//		s.setId(10);
//		s.setRankings("ABDCE");
//		System.out.println(s.getRankings() + ", " +  s.getId());
//	}
	

}
