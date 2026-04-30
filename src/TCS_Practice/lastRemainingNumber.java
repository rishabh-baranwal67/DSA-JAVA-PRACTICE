package TCS_Practice;
import java.util.*;
public class lastRemainingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("\\s+");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int j = k-1;
        for(int r = 0; r < n-1; r++){
            j = j % list.size();
            list.remove(j);
            j = j + (k-1);
        }
        System.out.println(list.get(0));
        System.out.println(list);
    }
}
