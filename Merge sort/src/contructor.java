import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class contructor{

    public static int[] numeros;

    public static int[] generateRandomArray(int number) {
        ArrayList<Integer> array = new ArrayList();                                                         
        for (int i = 0; i <= number; i++) {
            array.add(i);
        }
        Collections.shuffle(array);
        numeros = new int[number];
        Random num = new Random();
        for (int i = 0; i < number; i++) {
            numeros[i] = num.nextInt(100);
        }
        return numeros;
    }

    public static int[] aaaa(int valor){
        return numeros; 
    }
}