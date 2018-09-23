package firstProject;

public class Rectqngle {
	Point origin;
	double xlength;
	double ylength;
	static int nbr = 0;
	public Rectqngle(Point origin , double xlength , double ylength)
	{
		 
		if(xlength <0 || ylength <0)
		{
			double xorigin = origin.x;
			double yorigin = origin.y;
			if(xlength<0)
			{
				xlength = -xlength;
				xorigin = origin.x - xlength;
			}
			if(ylength<0)
			{
				ylength = -ylength;
				yorigin = origin.y - ylength;
			}
			// creation dun nouveau point de la base
			origin = new Point(xorigin , yorigin);
		}
		this.origin = origin;
		this.xlength = xlength;
		this.ylength = ylength;
	
	}
	public  Rectqngle(Point a , Point b)
	{
		this(a,b.x - a.x, b.y-a.y);
	}
	public Rectqngle(double x , double y , double xlength,double ylength)
	{
		this(new Point(x,y) , xlength, ylength);
	}
	public String toString() {
		return "(" + origin.x + "+" + xlength + 
		       "," + origin.y + "+" + ylength + ")";
	}
	public boolean Equals(Rectqngle r)
	{
		return origin.sameAs(r.origin) && xlength == r.xlength && ylength == r.ylength;
	}
	public void translate(double dx , double dy)
	{
		origin.translate(dx, dy);
	}
	public double surface(Rectqngle r) 
	{
		return r.xlength * r.ylength;
	}
	public double surface()
	{
		return xlength*ylength;
	}
	public boolean contains(Point r)
	{
		if(origin.x <= r.x && r.x <= origin.x + xlength && origin.y<= r.y && r.y<= origin.y + ylength)
		{
			return true;
		}else
		{
			return false;
		}
	}
	public boolean contains(Rectqngle r)
	{
		if(this.contains(r.origin) &&  r.origin.x + r.xlength <= origin.x + xlength 
				&& r.origin.y + r.ylength <= this.origin.y + this.ylength ) 
		{
			return true;
		}else
		{
			return false;
		}
	}
	public Rectqngle hull(Rectqngle [] table)
	{
		// abcisse minimal par defaut 
		// initialisation pour la comparaison des element dun tableau
		double xmin = table[0].origin.x;
		// abcisse maximal par defaut
		double xmax = table[0].origin.x + table[0].xlength;
		double ymin = table[0].origin.y;
		double ymax = table[0].origin.y + table[0].ylength;
		for(int i = 1 ; i< table.length ; i++)
		{
			if(table[i].origin.x < xmin)
			{
				xmin = table[i].origin.x;
			}
			if(table[i].origin.x + table[i].xlength > xmax)
			{
				xmax = table[i].origin.x + table[i].xlength;
			}
			if(table[i].origin.y < ymin)
			{
				ymin  = table[i].origin.y;
			}
			if(table[i].origin.y + table[i].ylength > ymax)
			{
				ymax = table[i].origin.y + table[i].ylength;
			}
		}
		// creation dun rectangle
		return new Rectqngle( new Point (xmin,ymin),
				xmax - xmin ,
				ymax - ymin);
	}
	
	
	
}
