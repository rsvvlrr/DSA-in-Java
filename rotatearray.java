import java.util.*;

public class rotatearray {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;

        for(int i = 0; i < d; i++) {
            int first = arr[0];

            for(int j = 0; j < n-1; j++) {
                arr[j] = arr[j+1];
            }

            arr[n-1] = first;
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 1, 2, 4,9,0};
        int d = 3;

        rotateArr(arr, d);

        System.out.println(Arrays.toString(arr));
    }
}