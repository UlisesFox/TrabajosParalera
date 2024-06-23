/*import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;

public class ForKJoin extends RecursiveAction {

    private int[] nums;
    private int l, r;

    public ForKJoin(int[] nums, int l, int r) {
        this.nums = nums;
        this.l = l;
        this.r = r;
    }

    @Override
    protected void compute() {
        if (l < r) {
            int m = (l + r) / 2;
            ForKJoin left = new ForKJoin(nums, l, m);
            ForKJoin right = new ForKJoin(nums, m + 1, r);
            invokeAll(left, right);
            merge(nums, l, m, r);
        }
    }

    private void merge(int[] nums, int l, int m, int r) {
        int[] tmp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r) {
            if (nums[i] <= nums[j]) {
                tmp[k++] = nums[i++];
            } else {
                tmp[k++] = nums[j++];
            }
        }
        while (i <= m) {
            tmp[k++] = nums[i++];
        }
        while (j <= r) {
            tmp[k++] = nums[j++];
        }
        System.arraycopy(tmp, 0, nums, l, r - l + 1);
    }

    public static void inic() {
        long inicio = System.nanoTime();
        int[] nums = contructor.aaaa(0);
        ForKJoin sortTask = new ForKJoin(nums, 0, nums.length - 1);
        ForkJoinPool fjPool = new ForkJoinPool();
        fjPool.invoke(sortTask);
        printArray(nums);

        long fin = System.nanoTime();
    
        long tiempo = fin - inicio;
        String salida = "Fork Join tardo:" + "\n" + "Nanosegundos: " + tiempo + "\n" + "Millisegundos: " + tiempo/1000000;
        App.textArea6.setText(salida);
    }

    static void printArray(int nums[]){
        String res = "";
        int n = nums.length;
            for (int i=0; i<n; ++i){
            res += nums[i]+ " ";
            }
            App.textArea4.setText(res);
    }
}*/

import java.util.Arrays;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;

public class ForKJoin extends RecursiveAction {

    private static final int THRESHOLD = 10000000;
    private final int[] data;
    private final int left;
    private final int right;

    public ForKJoin(int[] data) {
        this(data, 0, data.length - 1);
    }

    private ForKJoin(int[] data, int left, int right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    protected void compute() {
        if (right - left < THRESHOLD) {
            Arrays.sort(data, left, right + 1);
        } else {
            int pivotIndex = partition(data, left, right);
            ForKJoin leftSorter = new ForKJoin(data, left, pivotIndex - 1);
            ForKJoin rightSorter = new ForKJoin(data, pivotIndex + 1, right);
            invokeAll(leftSorter, rightSorter);
        }
    }

    private int partition(int[] data, int left, int right) {
        int pivot = data[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (data[j] <= pivot) {
                i++;
                swap(data, i, j);
            }
        }
        swap(data, i + 1, right);
        return i + 1;
    }

    private void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public static void inic() {
        long inicio = System.nanoTime();
        int[] data = contructor.aaaa(0);

        ForKJoin sorter = new ForKJoin(data);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(sorter);
        App.textArea4.setText(Arrays.toString(data));

        long fin = System.nanoTime();
    
        long tiempo = fin - inicio;
        String salida = "Fork Join tardo:" + "\n" + "Nanosegundos: " + tiempo + "\n" + "Millisegundos: " + tiempo/1000000;
        App.textArea6.setText(salida);
    }
}