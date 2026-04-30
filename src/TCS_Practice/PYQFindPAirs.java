package TCS_Practice;
import java.util.*;

public class PYQFindPAirs {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    int x = sc.nextInt();
    int y = sc.nextInt();
    int pairCount = 0;
    for(int i = 0; i < n; i++){
        int first = arr[i];
        for(int j = 0; j < n; j++){
            int second = arr[j];
            String s = first + "" + second;
            int num = Integer.parseInt(s);
            if(num >= x && num <= y){
                pairCount++;
//            if((first*10 + second ) <= y && (first*10 + second ) >= x ){
//                pairCount++;
//            }
//            if((second* 10 + first) <= y && (second* 10 + first) >= x){
//                pairCount++;
            }
        }
    }
    System.out.println(pairCount);
    }
}
