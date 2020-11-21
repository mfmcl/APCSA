package APCSA_Homework.src;

/**
2.	Define a class Rectangle
-	Fields: private point PointA, private point PointC
-	Constructors take either non or both points lying on the same diagonal. The rectangle is horizontal, not turned!
-	Methods:
o	 toString() will print „I am Rectangle with PointA, PointB“
o	 randomSize() will set random points A and C
o	 getArea() method will return a number of area covered by rectangle () 
|X1-X2|*|Y1- Y2|
o	 moveIt(int) will increase both points‘ X coordinate.

3.	Inside your main program generate 2 times random Rectangle, 
-	Using toString() method print points.
-	Call moveIt(50)
-	Using toString() method print points.
-	get their area

 */
public class Rectangle {

    private Point PointA;
    private Point PointC;

    Rectangle() {
        
    }
    Rectangle(Point a, Point c) {

    }

    public static void randSize() {

    }

    public int getArea() {
        int area = Math.abs(PointA.getX() - PointC.getX()) * Math.abs(PointA.getY() - PointC.getY());
        return area;
    }

    @Override
    public String toString() {
        return "I am a rectangle with point A:"+ PointA + " Point B: " + PointC ;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println(rect.toString());   
    }