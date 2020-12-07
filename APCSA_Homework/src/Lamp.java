package APCSA_Homework.src;

public class Lamp {
    private boolean isOn = false;
    private String color = "white";
    private float angle = 0; 

    Lamp() {}

    Lamp(String color) {
        this.color = color;
    }

    Lamp(String color, int angle) { // 6a color, angle = formal parameters
        this.color = color; 
        this.angle = angle;
    }
    /*
    "this" as used in the above constructors, tells the compiler (and coder) 
    that the variable being reffered to is the class variable, not a local variable of the same name.
    */

    public void toggleOn() {
        if (isOn == true) { // 7. implementation code?
            isOn = false;
        } else
            isOn = true;
    }

    public boolean getState() {
        return isOn;
    }

    public void setAngle(int angle) { // 8. sets angle of lamp arm
        this.angle += angle;
    }

    public void setAngle(float angle) {
        this.angle += angle;
    }

    public float getAngle() { // 9. returns angle of lamp arm
        return angle;
    }

    @Override
    public String toString() {
        if (isOn == true) {
            return "This lamp is on. Color is " + color + ". Arm angle is " + angle + " degrees";
        } else
            return "This lamp is off. Color is " + color + ". Arm angle is " + angle + " degrees";
    }

    public static void main(String[] args) {
        Lamp L1 = new Lamp(); // 1.
        Lamp L2 = new Lamp("red", 180); // 6b actual parameters
        Lamp L3 = new Lamp(); // 2., 3. angle  of both will be 180, as it is the maximum possible value
        L3 = L2;
        
        L2.setAngle(1.5F); // 4., 5. angle of both L2 and L3 will still be 180, as it's the maximum possible value

        System.out.println(L1.toString());
        System.out.println(L2.toString());
        
        // 10. primitive varibale: int x = 1;
        //     referenced variable: String name = "John";

        // 11. an "instance" of a class is a specific object made with that class

    }
}