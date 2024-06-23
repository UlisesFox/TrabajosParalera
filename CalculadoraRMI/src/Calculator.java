import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    int calculate1(int number1) throws RemoteException;
    int calculate2(int number2) throws RemoteException;
    int calculator(String operator) throws RemoteException;
}
