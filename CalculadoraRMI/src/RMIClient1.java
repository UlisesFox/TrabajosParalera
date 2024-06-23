import java.rmi.Naming;
import javax.swing.SwingUtilities;

public class RMIClient1 {
    private static Calculator calculator;

    public static void main(String[] args) {
        try {
            calculator = (Calculator) Naming.lookup("rmi://localhost/CalculatorService1");

            SwingUtilities.invokeLater(() -> interfaz1.createAndShowGUI(calculator));
        } catch (Exception e) {
            System.err.println("Error al invocar el método remoto: " + e.getMessage());
        }
    }
}
