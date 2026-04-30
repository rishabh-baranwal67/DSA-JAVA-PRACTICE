package TCS_Practice;
import java.util.*;

public class PYQOddBalloonFind {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] strArr = s.split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();
        for(String str : strArr){
            map.put(str, map.getOrDefault(str, 0) +1);
        }
        boolean found = false;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue()%2 == 1){
                System.out.println("the ballon which has odd number of time occurance is : " + entry.getKey() + " and it occured " + entry.getValue() + " time.");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("All are even");
        }
    }
}
