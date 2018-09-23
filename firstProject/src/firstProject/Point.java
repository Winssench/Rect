package firstProject;

public class Point {
	   double x;
	    double y;

	    // Constructeur trivial
	    // x et y sont initialisés à 0
	    Point(){}

	    // Constructeur avec initialisation des coordonnées
	    Point(double x, double y) {
		this.x = x;
		this.y = y;
	    }
	    // Affichage
	    public String toString() {
	    	return "(" + x + "," + y + ")";
	    }
	    // Déplacement
	    void translate(double dx, double dy) {
		x += dx;
		y += dy;
	    }
	    // Distance à un autre point
	    double distance(Point p) {
		double dx = this.x - p.x;
		double dy = this.y - p.y;
		return Math.sqrt(dx * dx + dy * dy);
	    }
	    // Égalité de deux points
	    boolean sameAs(Point p) {
	    	return x == p.x && y == p.y;
	    }

}
