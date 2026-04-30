package TCS_Practice;
import java.util.*;

public class PYQMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] inter = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                inter[i][j] = sc.nextInt();
            }
        }
        int[][] exet = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                exet[i][j] = sc.nextInt();
            }
        }
        int i = sc.nextInt();
        int j = sc.nextInt();
        int totalMark = inter[i][j] + exet[i][j];
        System.out.println(totalMark);
    }
}
