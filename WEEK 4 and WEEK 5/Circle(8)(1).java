public class Circle
{
   // declare constants for 
   //DEFAULT_RADIUS, set to 10
   //DEFAULT_MOVE, set to 20
   //DEFAULT_LOC, set to 100
   // ** we will be modifying these  in chapter 8 **
   private static final int DEFAULT_RADIUS = 10;
   private static final int DEFAULT_MOVE = 20;
   private static final int DEFAULT_LOC = 100;
   private static final int DEFAULT_X = 0;
   private static final int DEFAULT_Y = 0;
      
   // declare instance variables for radius, x and y (all integers)
   private int radius;
   private int x;
   private int y;
   
   // create a default constructor that sets radius to DEFAULT_RADIUS and
   // sets x and y to DEFAULT_LOC;
   public Circle()
   {
      this(DEFAULT_X, DEFAULT_Y, DEFAULT_RADIUS);
  
   }
   // create an alternate constructor that takes in
   // three integer arguments for x, y and radius
   public Circle(int xval, int yval, int r)
   {
      radius = r;
      x = xval;
      y = yval;
   
   }
   // create an alternate constructor that takes in
   // two integer arguments to set the x and y
   // default radius to DEFAULT_RAD
   public Circle(int xval, int yval)
   {
      radius = DEFAULT_RADIUS;
      x = xval;
      y = yval;
   
   }

   // Define a move method that takes no parameters and
   // changes x value and y value by adding value in DEFAULT_MOVE
   public void move()
   {
      x += DEFAULT_MOVE;
      y += DEFAULT_MOVE;
   
   }

   // Define a move method that takes in two integer values
   // representing the amount to change (move) x and y
   public void move(int xmove, int ymove)
   {
      x += xmove;
      y += ymove;
   }
   
   // getX
   public int getX()
   {  
      return x;
   }   
   // getY
   public int getY()
   {  
      return y;
   }   
   // getRadius
   public int getRadius()
   {  
      return radius;
   }   
   
   // get numCircles
   public static int getNumCircles() {
      return numCircles();
   }
   @Override
   public String toString() {
      String s = String.format("x : %d, y : %d, radius : %d", getX(), getY(), getRadius());
      return s;                  
   }
   
   @Override
   public boolean equals(Object other) {
      Circle cOther = (Circle)other; //allows the constructor to look for a circle within a object address
      if(this.x == cOther.x && this.y == cOther.y && this.radius == cOther.radius) //"this." is not needed but I like it so there! //
         return true;
      return false;
   }
      
}
