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
	public void translate(double dx, double dy)
	{
		for(int i = 0 ; i< nombre; i++)
		{
			tableau.get(i).translate(dx, dy);
		}
	}
	// teste si un rectangle est dans un des rectangle de dessin
	public boolean contains(Rectqngle r)
	{
		for(int i = 0 ; i< nombre; i++)
		{
			if(tableau.get(i).contains(r))
			{
				return true;
			}
		}
		return false;
	}
	public boolean contains(Point p)
	{
		for(int i = 0 ; i< nombre; i++)
		{
			if(tableau.get(i).contains(p))
			{
				return true;
			}
		}
		return false;
	}
	
}
