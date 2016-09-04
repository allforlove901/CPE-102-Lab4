/**
 * Class made to add points to an array list and display that array list
 */

import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.awt.geom.Ellipse2D;

public class Cloud {

	public ArrayList<Point2D.Double> dots = new ArrayList<Point2D.Double>();
	
	/**
	 * adds a point to dots
	 * @param point a Point2D.Double
	 */
	public void add(Point2D.Double point)
	{
		dots.add(point);
	}
	
	/**
	 * draws circle for each point in dots
	 * @param g2 graphics component
	 */
	public void draw(Graphics2D g2)
	{
		for(Point2D.Double dot:dots)
		{
			Ellipse2D.Double circ = new Ellipse2D.Double(dot.x, dot.y, 5, 5);
			g2.draw(circ);
		}
	}
	
}
