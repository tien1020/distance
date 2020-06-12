public class Point
{
   private int x;
   private int y;
   
   public Point()
   {
      this(0,0);
   }
   
     public Point(int xVal, int yVal)
   {
      this.x = xVal;
      this.y = yVal;
   }

   public int getX() 
   {
      return x;
   }
   
   public int getY()
   {
      return y;
   }
   
   public void setPoint(int newX, int newY)
   {
      this.x=newX;
      this.y=newY;
   }
 
   
   public String toString() 
   {
      return "(" + x + ", " + y + ")";
   }
   
   public double distance(double x, double y) {
        return Math.sqrt(Math.pow((this.x - x),2) + Math.pow((this.y - y),2) );
    }

   public double distance(Point point) {

        return distance(point.x, point.y);
    }
}