package TCS_Practice;
import java.util.*;

public class PYQSortingQuestion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j ,j -1);
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
