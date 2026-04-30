package TCS_Practice;
// find the number of elements in an array which value is greater than its prior element
import java.util.*;

public class PYQ2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] strArr = s.split("\\s+");
        int[] arr = new int[n];
        int k = 0;
        for(String str : strArr){
            int num = Integer.parseInt(str);
            arr[k++] = num;
        }
        int count = 1;
//
        for(int i = n-1; i > 0; i--){
            int temp = arr[i];
            for(int j = i-1; j>= 0; j--){
                if(arr[j] > temp){
                    break;
                }
                else if(arr[j] < temp && j == 0){
                    count++;
                    System.out.println("count : " + count  + " i : " + i +  " j : " + j);
                }
            }
        }
        System.out.println(count);

//        int l = arr[0];
//        for(int i = 1; i < n; i++){
//            int r = arr[i];
//            for(int j = i; j >=0; j--){
//                int l = arr[j];
//                if(r > l){
//                    if(j == 0){
//                        count++;
//                    }
//                }
//                else if(r < l) break;
//            }
//        }
//        int j = arr[n-1];
    }
}
