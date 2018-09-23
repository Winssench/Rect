package firstProject;

public class Point {
	   double x;
	    double y;

	    // Constructeur trivial
	    // x et y sont initialis�s � 0
	    Point(){}

	    // Constructeur avec initialisation des coordonn�es
	    Point(double x, double y) {
		this.x = x;
		this.y = y;
	    }
	    // Affichage
	    public String toString() {
	    	return "(" + x + "," + y + ")";
	    }
	    // D�placement
	    void translate(double dx, double dy) {
		x += dx;
		y += dy;
	    }
	    // Distance � un autre point
	    double distance(Point p) {
		double dx = this.x - p.x;
		double dy = this.y - p.y;
		return Math.sqrt(dx * dx + dy * dy);
	    }
	    // �galit� de deux points
	    boolean sameAs(Point p) {
	    	return x == p.x && y == p.y;
	    }

}
