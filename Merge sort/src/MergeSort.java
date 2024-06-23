/*public class MergeSort extends App {

    
    public void MS(){
        
        long inicio = System.nanoTime();
        int[] numeros = contructor.aaaa(0);

        MergeSort ob = new MergeSort();
        ob.sort(numeros, 0, numeros.length-1);

        printArrayA(numeros);
        
        long fin = System.nanoTime();

        long tiempo = fin - inicio;
        tiempo = tiempo + 100000000;

        String salida = "Merge Sort tardo:" + "\n" + "Nanosegundos: " + tiempo + "\n" + "Millisegundos: " + tiempo/1000000;
        textArea5.setText(salida);
    }

    void merge(int numeros[], int l, int m, int r){

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = numeros[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = numeros[m + 1+ j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                numeros[k] = L[i];
                i++;
            }else{
                numeros[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1){
            numeros[k] = L[i];
            i++;
            k++;
        }

        while (j < n2){
            numeros[k] = R[j];
            j++;
            k++;
        }
    }
 
    void sort(int numeros[], int l, int r){
        if (l < r){
            int m = (l+r)/2;

            sort(numeros, l, m);
            sort(numeros , m+1, r);
            merge(numeros, l, m, r);
        }
    }

    static void printArrayA(int numeros[]){
        String res = "";
        int n = numeros.length;
            for (int i=0; i<n; ++i){
            res += numeros[i]+ " ";
            }
        textArea4.setText(res);
    }
}*/

import java.util.Arrays;

public class MergeSort extends App {

    
    public void MS(){
        
        long inicio = System.nanoTime();
        int[] nums = contructor.aaaa(0);

        MergeSort.sort(nums);
        textArea4.setText(Arrays.toString(nums));
        
        long fin = System.nanoTime();

        long tiempo = fin - inicio;

        String salida = "Merge Sort tardo:" + "\n" + "Nanosegundos: " + tiempo + "\n" + "Millisegundos: " + tiempo/1000000;
        textArea5.setText(salida);
    }

    public static void sort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        mergeSort(nums, 0, nums.length - 1);
    }

    private static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(nums, left, middle);
            mergeSort(nums, middle + 1, right);
            merge(nums, left, middle, right);
        }
    }

    private static void merge(int[] nums, int left, int middle, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = middle + 1, k = 0;
        while (i <= middle && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= middle) {
            temp[k++] = nums[i++];
        }
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        System.arraycopy(temp, 0, nums, left, temp.length);
    }
}
