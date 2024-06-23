import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {
    protected CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public int calculate1(int num1) throws RemoteException {
        NumberData numberData = NumberData.getInstance();
        numberData.setNumber(num1);
        return num1;
    }

    @Override
    public int calculate2(int num2) throws RemoteException {
        NumberData2 numberData2 = NumberData2.getInstance();
        numberData2.setNumber2(num2);
        return num2;
    }

    @Override
    public int calculator(String operator) throws RemoteException{
        NumberData numberData = NumberData.getInstance();
        int num1 = numberData.getNumber();
        NumberData2 numberData2 = NumberData2.getInstance();
        int num2 = numberData2.getNumber2();

        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new RemoteException("No se puede dividir por cero.");
                }
            default:
                throw new RemoteException("Operador inválido.");
        }
    }
}
