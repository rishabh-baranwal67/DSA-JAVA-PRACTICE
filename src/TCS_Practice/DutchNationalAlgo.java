package TCS_Practice;
import java.util.*;

public class DutchNationalAlgo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int low = 0, mid = 0, high = n-1;
        while(high >= mid){
            if(arr[mid] == 0){
                swap(arr, mid, low);
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));

//        System.out.println(Arrays.toString(arr));
    }
//    public static int[] dutch(int[] arr, int n){
//        int low = 0, mid = 0, high = n-1;
//        while(high >= mid){
//            if(arr[mid] == 0){
//                swap(arr, arr[mid], arr[low]);
//                mid++;
//                low++;
//            }
//            else if(arr[mid] == 1){
//                mid++;
//            }
//            else{
//                swap(arr, arr[mid], arr[high]);
//                high--;
//            }
//        }
//        return arr;
//    }
    public static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
