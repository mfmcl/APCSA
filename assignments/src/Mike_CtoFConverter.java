package assignments.src;

/**
 * CtoFConverter
 */
// V:Create a degrees celsius to fahrenheit function. Input Celsius degrees,
import javax.swing.JOptionPane;

public class Mike_CtoFConverter {

    public static void main(String[] args) {
        String degCString = JOptionPane.showInputDialog(null, "Degrees in celsius", "C to F Converter",
                JOptionPane.QUESTION_MESSAGE);
        double degC = Double.valueOf(degCString);
        double degF = degC * 1.8 + 32;
        JOptionPane.showMessageDialog(null, degC + "°C is equal to " + degF + "°F");
    }
}