public class NumberData2 {
        private int number2;
        
        private static NumberData2 instance;
        
        private NumberData2() {
            // Constructor privado para evitar la creación de instancias directamente
        }
        
        public static NumberData2 getInstance() {
            if (instance == null) {
                instance = new NumberData2();
            }
            return instance;
        }
        
        public int getNumber2() {
            return number2;
        }
        
        public void setNumber2(int newNumber) {
            number2 = newNumber;
        }
    }
    