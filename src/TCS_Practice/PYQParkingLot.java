package TCS_Practice;
import java.util.*;

public class PYQParkingLot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int maxCount = 0;
        int maxRow = 0;
        for(int i = 0; i < r; i++){
            int count = 0;
            for(int j = 0; j < c; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(count > maxCount){
                maxRow = i +1;
                maxCount = count;
            }
        }
        System.out.println("the row that has max no. of 1's is : " + maxRow );
    }
}
