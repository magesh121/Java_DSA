package comparator;

import java.util.Comparator;

public class SortByPosition implements Comparator<Cricket>{

	@Override
	public int compare(Cricket c1, Cricket c2) {
		
		return c1.Position-c2.Position;
	}
	

}
