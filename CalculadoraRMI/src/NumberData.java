public class NumberData {
    private int number;
    
    private static NumberData instance;
    
    private NumberData() {
        // Constructor privado para evitar la creación de instancias directamente
    }
    
    public static NumberData getInstance() {
        if (instance == null) {
            instance = new NumberData();
        }
        return instance;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int newNumber) {
        number = newNumber;
    }
}
