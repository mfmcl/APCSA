package Animals;

/**
 * Demostration of Abstract, Interfaces, Polymorphism
 * 
 * This is main program
*   - Add new animal Type
    - Add function to showYourself()
 */

public class Nature {
    public static void main(String[] args) {
        System.out.println("\n************ Creating animals ************");

        Eagle e = new Eagle();
        System.out.println(e.showYourself());

        Cheetah c = new Cheetah();
        System.out.println(c.showYourself());

        System.out.println("************ Finished ************");
         
    }
}
