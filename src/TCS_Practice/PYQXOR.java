package TCS_Practice;
import java.util.*;

public class PYQXOR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = 0;
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < n; i++){
            result = result ^ arr[i];
        }
        System.out.println("the number that occurs one time is : " + result);
    }
}
