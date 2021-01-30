package assignments.src;

/**
 * 2. Define a class Rectangle - Fields: private point PointA, private point
 * PointC - Constructors take either non or both points lying on the same
 * diagonal. The rectangle is horizontal, not turned! - Methods:
 * o toString() will print „I am Rectangle with PointA, PointB“
 * o randomSize() will set random points A and C
 * o getArea() method will return a number of area covered by rectangle () |X1-X2|*|Y1- Y2|
 * o moveIt(int) will increase both points‘ X coordinate.
 * 
 * 3. Inside your main program generate 2 times random Rectangle, - Using
 * toString() method print points. - Call moveIt(50) - Using toString() method
 * print points. - get their area
 * 
 */
public class Rectangle {

    private Point a = new Point();
    private Point c = new Point();

    Rectangle() {
    }

    Rectangle(Point a, Point c) {
        this.a = a;
        this.c = c;
    }

    public void randSize() {
        a.randPos();
        c.randPos();
    }

    public int getArea() {
        int area = Math.abs(a.getX() - c.getX()) * Math.abs(a.getY() - c.getY());
        return area;
    }

    public void moveIt(int x) {
        a.changeX(50);
        c.changeX(50);
    }

    @Override
    public String toString() {
        return "Rectangle with point A: " + a + " Point C: " + c;
    }

    public static void main(String[] args) {
        Point x = new Point(2, 4);
        Point y = new Point(10, 2);
        Rectangle rect = new Rectangle(x, y);
        System.out.println(rect.toString());   
        System.out.println("Area: " + rect.getArea());

        Rectangle randomRect1 = new Rectangle();
        Rectangle randomRect2 = new Rectangle();
        randomRect1.randSize();
        randomRect2.randSize();
        randomRect1.moveIt(50);
        randomRect2.moveIt(50);
        System.out.println(randomRect1.toString());
        System.out.println(randomRect2.toString());
        System.out.println("Area: " + randomRect1.getArea());
        System.out.println("Area: " + randomRect2.getArea());


    }
}