package comparator;

public class Cricket {
	
	String TeamName;
	int Position;
	
	
	public Cricket(String teamName, int position) {
		this.TeamName = teamName;
		this.Position = position;
	}


	@Override
	public String toString() {
		return "Cricket [TeamName=" + TeamName + ", Position=" + Position + "]";
	}
	 
	

}
