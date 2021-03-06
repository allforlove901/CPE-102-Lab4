/**
   This is a tester class for Polygon.
*/
public class PolygonTester
{
   public static void main(String[] args)
   {
      Polygon square = new Polygon(4);
      
      square.add(100, 100);
      square.add(100, 150);
      square.add(150, 150);
      square.add(150, 100);  
      
      Polygon hexagon = new Polygon(6);

      // construct a regular hexagon
      hexagon.add(50, -87);
      hexagon.add(-50, -87);
      hexagon.add(-100, 0);
      hexagon.add(-50, 87);
      hexagon.add(50, 87);
      hexagon.add(100, 0);


      
      double squarePerimeter = square.perimeter();
      System.out.println("Square perimeter: " + squarePerimeter);
      System.out.println("Expected: 200.0");

      double squareArea = square.area();
      System.out.println("Square area: " + squareArea);
      System.out.println("Expected: 2500.0");

      double hexagonPerimeter = hexagon.perimeter();
      System.out.println("Hexagon perimeter: " + hexagonPerimeter);
      System.out.println("Expected: 600.0");

      double hexagonArea = hexagon.area();
      System.out.println("Hexagon area: " + hexagonArea);
      System.out.println("Expected: 26100.0");
   }
}