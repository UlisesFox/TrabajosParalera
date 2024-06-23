import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            Calculator calculator1 = new CalculatorImpl();
            Calculator calculator2 = new CalculatorImpl();

            LocateRegistry.createRegistry(1099);

            Naming.rebind("rmi://localhost/CalculatorService1", calculator1);
            Naming.rebind("rmi://localhost/CalculatorService2", calculator2);

            System.out.println("Servidor RMI iniciado correctamente.");
        } catch (RemoteException e) {
            System.err.println("Error al iniciar el servidor RMI: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error en el servidor: " + e.getMessage());
        }
    }
}
