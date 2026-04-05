public class reversearray{
    public static void main(String[] args) {
        int arr[]={10,20,35,60,55,740,6,88};
        int n = arr.length;
        int i=2;
        int j=5;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}