public class Passingarraytomethod {
    public static void main(String[] args) {
        int [] arr ={20,30,40,50};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    
    }
    public static void change(int arr[]) 
    {
        arr[2]=25;
        
    }
}
