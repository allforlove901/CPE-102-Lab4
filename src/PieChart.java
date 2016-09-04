/**
 * Class made to add values to a pie chart and draw said pie chart
 */

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;

public class PieChart {

	private ArrayList<Double> values = new ArrayList<Double>();
	private ArrayList<Double> percentages = new ArrayList<Double>();
	private int height, width;
	private double hyp = 125;
	private Point2D.Double center = new Point2D.Double();
	
	public PieChart(int width, int height){
		this.height = height;
		this.width = width;
		center.setLocation(150,135);
	}
	
	
	public void add(double d)
	{
		values.add(d);
	}
	
	public void draw(Graphics2D g2)
	{
		getPercentages();
		double mark = 0;
		
		Ellipse2D.Double pie = new Ellipse2D.Double(25,10,250,250);
		g2.draw(pie);
		
		for(double percent:percentages)
		{
			Line2D.Double line = new Line2D.Double(center, getPoint(mark*360));
			g2.draw(line);
			mark+=percent;
		}
		
		Line2D.Double line = new Line2D.Double(center, getPoint(180));
	}
	
	public void getPercentages()
	{
		double sum = 0;
		
		for(Double d:values)
			sum+= d;
		for(Double d:values)
			percentages.add(d/sum);
	}
	
	public Point2D.Double getPoint(double angle)
	{
		Point2D.Double p = new Point2D.Double();
		p.setLocation(Math.cos(angle/180*Math.PI)*hyp, Math.sin(angle/180*Math.PI)*hyp);
		p.setLocation(center.getX()+p.getX(), center.getY()+p.getY());
		return p;
	}
}
