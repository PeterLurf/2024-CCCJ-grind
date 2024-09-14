package ImportantAlgorithms;
import java.util.*;
@SuppressWarnings("unused")
public class kadanes {
    public static void main(String[] args) {
        int[] arr = {1, 5, 5, -5, 5, 5, 3, -4,4 ,2 , -23, 4, 5, 6, -7, 8, 9, 10, 11, -12, 13, 14, -15};
        int max = arr[0];
        int sum = arr[0];
        int start = 0;
        int end = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > sum + arr[i]) {
                sum = arr[i];
                start = i;
            } else {
                sum += arr[i];
            }
            if (sum > max) {
                max = sum;
                end = i;
            }
        }
        System.out.println(max);
        System.out.println(start + " " + end);

    }
}
