package firstProject;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
	private int nombre = 0;
	private List<Rectqngle> tableau = new ArrayList<Rectqngle>();
	public Dessin()
	{
		
	}
	public List<Rectqngle> add(Rectqngle r)
	{
		tableau.add(r);
		nombre++;
		return (tableau);
	}
}
