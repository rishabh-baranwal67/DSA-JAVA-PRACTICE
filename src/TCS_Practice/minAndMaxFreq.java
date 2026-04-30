package TCS_Practice;
import java.util.*;

public class minAndMaxFreq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] tempArr = str.split("\\s+");
        int n = tempArr.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(tempArr[i]);
        }
        Map<Integer, Integer> map = new HashMap<>();
        int minEle = -1;
        int maxEle = -1;
        int minCount = Integer.MAX_VALUE;
        int maxCount = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0) +1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxEle = entry.getKey();
            }
            if(entry.getValue() < minCount){
                minCount = entry.getValue();
                minEle = entry.getKey();
            }
        }
        System.out.println("min freq element : " + minEle);
        System.out.println("max freq element : " + maxEle);
    }
}
