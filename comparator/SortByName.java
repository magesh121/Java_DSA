package comparator;

import java.util.Comparator;

public class SortByName implements Comparator<Cricket>{

	@Override
	public int compare(Cricket c1, Cricket c2) {
		
		return c1.TeamName.compareTo(c2.TeamName);
	}


}
