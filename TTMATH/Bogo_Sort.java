package TTMATH;
import java.util.*;

public class Bogo_Sort {
    int[] arr = {1,3,5,1,67,8,6,25,734,435,7,2,6,4};
    public static void main(String[] args) {
        Bogo_Sort bs = new Bogo_Sort();
        bs.bogoSort();
    }
    public void bogoSort() {
        while (!isSorted()) {
            shuffle();
        }
        System.out.println(Arrays.toString(arr));
    }
    public void shuffle() {
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }
    public boolean isSorted() {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    
}
