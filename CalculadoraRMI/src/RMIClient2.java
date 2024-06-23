import java.rmi.Naming;
import javax.swing.SwingUtilities;

public class RMIClient2{
    private static Calculator calculator;

    public static void main(String[] args) {
        try {
            calculator = (Calculator) Naming.lookup("rmi://localhost/CalculatorService2");

            SwingUtilities.invokeLater(() -> interfaz2.createAndShowGUI(calculator));
        } catch (Exception e) {
            System.err.println("Error al invocar el método remoto: " + e.getMessage());
        }
    }
}
