public class Agregar extends App {

    public void gene(){
    String valor = nombrecaja.getText();
    int number = Integer.parseInt(valor);
    int[] randomArray = contructor.generateRandomArray(number);


    printArrayD(randomArray);
    }
    

    static void printArrayD(int numeros[]){
        String res = "";
            int n = numeros.length;
            for (int i=0; i<n; ++i){
            res += numeros[i]+ " ";
            }
        textArea2.setText(res);
    }
}