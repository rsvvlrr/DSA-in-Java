public class linearsearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,7,50};
        int target = 7;
        boolean flag  = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
            flag = true;
            break;
        }
    }
    if(flag==true){
        System.out.println("target eelement exist");
    }
    else{
        System.out.println("Target element not exists");
    }
}
}