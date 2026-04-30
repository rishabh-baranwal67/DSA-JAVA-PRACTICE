package TCS_Practice;
import java.util.*;

public class SundayCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("mon", 6);
        map.put("tue", 5);
        map.put("wed", 4);
        map.put("thurs", 3);
        map.put("fri", 2);
        map.put("sat", 1);
        map.put("sun", 0);
        int count = 0;
        if(a - (map.get(s)) > 1){
            count = 1 + (a - map.get(s))/7;
        }
        System.out.println("No. sundays from : " + count );
    }
}
