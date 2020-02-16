public class Student {
	
	private Integer id;
	private String rankings;
	private byte utility = 0;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRankings() {
		return rankings;
	}
	public void setRankings(String rankings) {
		this.rankings = rankings;
	}
	public byte getUtility() {
		return utility;
	}
	public void setUtility(byte utility) {
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
