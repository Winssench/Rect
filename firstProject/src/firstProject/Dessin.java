package firstProject;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
	private int nombre = 0;
	private List<Rectqngle> tableau = new ArrayList<Rectqngle>();
	public Dessin(int size)
	{
		tableau  = new ArrayList<>(size);
		nombre = 0;
	}
	public List<Rectqngle> add(Rectqngle r)
	{
		tableau.add(r);
		nombre++;
		return (tableau);
	}
	public double surface()
	{
		double sum = 0;
		for(int i = 0 ; i< nombre; i++)
		{
			sum += tableau.get(i).surface();
		}
		return sum;
	}
	pub
}
