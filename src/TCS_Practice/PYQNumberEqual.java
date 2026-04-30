package TCS_Practice;
import java.util.*;

public class PYQNumberEqual {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int minCount = min(p,q,r);
        System.out.println(minCount);
    }
    public static int min(int p, int q , int r){
        if(p == q && q == r){
            return 0;
        }
        int[] arr = {p,q,r};
        int step = 0;
        Arrays.sort(arr);
        while(true){
            arr[0] += 1;
            arr[1] += 1;
            arr[2] -= 1;
            step++;
            if(arr[0] == arr[1] && arr[1] == arr[2]){
                return step;
            }
            Arrays.sort(arr);
            if(arr[0] == arr[1] && arr[1] +1 == arr[2] ||
                arr[1] == arr[2] && arr[0] +1 == arr[1]){
                return -1;
            }
        }
    }
}
