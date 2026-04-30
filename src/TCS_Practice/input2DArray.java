package TCS_Practice;
import java.util.*;

public class input2DArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String[] strArr = s.split("\\s+");
            for(int j = 0; j < m; j++){
                    arr[i][j] = Integer.parseInt(strArr[j]);
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
