package firstProject;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
	private int nombbre = 0;
	List<Rectqngle> tableau = new ArrayList<Rectqngle>();
	public ArrayList<Rectqngle> add(Rectqngle r)
	{
		tableau.add(r);
		return tableau;
	}
}
