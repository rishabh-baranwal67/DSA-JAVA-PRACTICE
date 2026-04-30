package TCS_Practice;
import java.util.*;

public class PYQFindSumInSubSequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        if(isFind(arr, target, 0 ,0)){
            System.out.println("yes, the subsequence is present");
        }
        else{
            System.out.println("No, not present");
        }
    }
    public static boolean isFind(int[] arr, int target, int tempSum, int index){
        if(tempSum == target) return true;
        if(index >= arr.length) return false;

        boolean c1  = isFind(arr, target, tempSum +arr[index], index+1);
        boolean c2 = isFind(arr, target, tempSum, index +1);
        return c1|| c2;
    }
}
