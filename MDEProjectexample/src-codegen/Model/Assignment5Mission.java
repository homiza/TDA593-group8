// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Model;

import Model.IMission;
import java.lang.String;
import java.util.List;

// Manual imports
import project.Point;
import java.util.ArrayList;
// End of manual imports

/************************************************************/
/**
 * 
 */
public class Assignment5Mission implements IMission {
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private List<Point> points;

	/**
	 * 
	 * @return 
	 */
	
	public Assignment5Mission(String name, List<Point> points) {
		this.name = name;
		this.points = new ArrayList<Point>(); //Change to list of points that allows for mission 5 to be completed. HARDCODE
		Point point1 = new Point(-3.5, 3.5);
        Point point2 = new Point(-3.5, -3.5);
        Point point3 = new Point (3.5, -3.5);
        Point point4 = new Point (3.5, 3.5);
        this.points.add(point1);
        this.points.add(point2);
        this.points.add(point3);
        this.points.add(point4);
		
	}
	
	public List<Point> getPoints() {
		return this.points;
	}

	/**
	 * 
	 * @return 
	 */
	public String getName() {
		return this.name;
	}
};