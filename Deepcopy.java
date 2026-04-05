import java.util.Arrays;
public class Deepcopy {
    public static void main(String[] args) {
            int [] arr = {10,20,30,40,50};
            int y [] = Arrays.copyOf(arr,arr.length);
            y[0]=1000;
            System.out.println(arr[0]);
             System.out.println(y[0]);
    }
}
