import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorS extends App {
    public void ini(){
        long inicio = System.nanoTime();
        int[] numeros = contructor.aaaa(0); 
        
        ExecutorService executor = Executors.newFixedThreadPool(numeros.length);
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    SwapTask task = new SwapTask(numeros, i, j);
                    executor.submit(task);
                }
            }
        }

        executor.shutdown();
        while (!executor.isTerminated()) {}

        App.textArea4.setText(Arrays.toString(numeros));

        long fin = System.nanoTime();
    
        long tiempo = fin - inicio;
        String salida = "ExecutorService tardo:" + "\n" + "Nanosegundos: " + tiempo + "\n" + "Millisegundos: " + tiempo/1000000;
        App.textArea7.setText(salida);
    }
}

class SwapTask implements Runnable {
    private int[] array;
    private int i;
    private int j;
    
    public SwapTask(int[] array, int i, int j) {
        this.array = array;
        this.i = i;
        this.j = j;
    }
    
    public void run() {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
