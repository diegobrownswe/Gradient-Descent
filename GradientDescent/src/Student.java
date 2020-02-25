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
}
