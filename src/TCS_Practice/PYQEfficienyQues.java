package TCS_Practice;
import java.util.*;

public class PYQEfficienyQues {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int maxD = 0;
        int k  = 0;
        for(int i = 0; i < n/2; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < t && k < n; j++){
                list.add(arr[k++]);
            }
            int diff = list.get(list.size() -1) - list.get(0);
            maxD = Math.max(maxD, diff);
        }
        System.out.println("the maximum diff is : " + maxD);
    }
}
