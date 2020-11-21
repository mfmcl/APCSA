package APCSA_Homework.src;

/**
 * 1. Define a class Point - Fields: private Int CoordinateX, private Int
 * CoordinateY - Constructors take either non or both (int X, int Y) arguments,
 * where X and Y are from <-100,100> closed interval Methods: o private
 * setCoordinates(int, int) will set CoordinateX, CoordinateY o private
 * getCoordinateX() will return X o private getCoordinateY() will return Y o
 * toString will print „I am a point with coordinate X: 52, coordinate Y:82“ You
 * can use only getter methods o randomPosition() will set random numbers of
 * coordinates. You can use only Setter methods o changeX(int) will increase the
 * X coordinate number by the given number
 */
public class Point {
    private int x;
    private int y;

    Point() {
    }

    Point(int x, int y) {
        setXY(x, y);
    }

    private void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int getX() {
        return x;
    }

    private int getY() {
        return y;
    }

    public void randPos() {
        int r1 = (int) (Math.random() * 201 - 100);
        int r2 = (int) (Math.random() * 201 - 100);
        setXY(r1, r2);
    }

    public void changeX(int a) {
        this.x += a;
    }

    @Override
    public String toString() {
        return "I am a point with coordinate X: " + getX() + ", coordinate Y: " + getY();
    }

    public static void main(String[] args) {
        Point p = new Point();

        System.out.println("x =" + p.getX());
        System.out.println("y =" + p.getY());

        p.setXY(4, 5);
        System.out.println("x =" + p.getX());
        System.out.println("y =" + p.getY());

        p.randPos();
        System.out.println("x =" + p.getX());
        System.out.println("y =" + p.getY());

        p.changeX(-5);
        System.out.println("x =" + p.getX());
        System.out.println("y =" + p.getY());

        System.out.println(p.toString());
    }
}
