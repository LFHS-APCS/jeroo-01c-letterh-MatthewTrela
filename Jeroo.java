/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {
    // Put any methods here
   public void plantVertLine() {
     plant();
     hop();
     plant();
     hop();
     plant();
     hop();
     plant();
     hop();
     plant();
   }

public void diagonal() {
    hop();  
    turn(LEFT);
    turn(LEFT);
    turn(LEFT);
    hop();
   }
   
public void moveUp() {
    turn(LEFT);
    turn(LEFT);
    hop();
    hop();
    turn(LEFT);
    turn(LEFT); 
  }
 public void plantHorzLine() {
   turn(LEFT);
   hop();
   plant();
   hop();
   plant();
   hop();
   turn(RIGHT);
   }
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
