import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
   A polygon is a closed curve made up from line segments
   that join the corner points.
*/
public class Polygon
{  
	private int index = 0;
	private double[][] corners;

   /**
      Constructs a polygon with no corner points.
   */
   public Polygon(int numberOfCorners)
   {  
      corners = new double[numberOfCorners][2];
   }

   /**
      Adds a corner point to the polygon.
      @param x the x-coordinate of the point
      @param y the y-coordinate of the point
   */
   public void add(double x, double y)
   {  
    	  corners[index][0] = x;
		  corners[index][1] = y;
		  index++;
   }

   /**
      Calculates the perimeter of a polygon.
      @return the perimeter of this polygon
   */
   public double perimeter()
   {  
	   int output = 0;
	   for(int i = 0; i<corners.length-1;i++)
	      {
		   	double dx = Math.pow((corners[i][0]-corners[i+1][0]),2);
		   	double dy = Math.pow((corners[i][1]-corners[i+1][1]), 2);
		   	output+= Math.sqrt(dx+dy);
	      }
	   double dx2 = Math.pow((corners[corners.length-1][0]-corners[0][0]),2);
	   double dy2 = Math.pow((corners[corners.length-1][1]-corners[0][1]),2);
	   output+= Math.sqrt(dx2+dy2);
	   return output;
   }

   /**
      Calculates the area of a polygon.
      @return the area of this polygon
   */
   public double area()
   {  
      double sumX = 0;
      double sumY = 0;
      for(int i = 0; i<corners.length;i++)
      {
	   	sumX+= corners[i][0];
	   	sumY+= corners[i][1];
      }
      double apothemx = sumX/corners.length;
      double apothemy = sumY/corners.length;
      
      double midpointx = (corners[0][0]+corners[1][0])/2;
      double midpointy = (corners[0][1]+corners[1][1])/2;
      
      double dx = Math.pow((apothemx - midpointx),2);
	  double dy = Math.pow((apothemy - midpointy),2);
      
      return 0.5*this.perimeter()*Math.sqrt(dx+dy);
   }   
}