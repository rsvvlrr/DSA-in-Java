public class shallowcopyDeepcopy {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        int[] x = arr;
        x[2] =50;

        System.out.println(arr[2]);
    }
    

}
