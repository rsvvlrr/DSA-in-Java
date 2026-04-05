

public class Twosum {
    public static void main(String[] args) {
        System.out.println("Two sum");
    }
    public static boolean twosum(int arr[],int target){
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j=0; j<n;j++){
                if(arr[i]+arr[j]==target){
                    return true;
    }    
            }
     }
    
     return false;
    }
}
