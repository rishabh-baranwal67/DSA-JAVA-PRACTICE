package TCS_Practice;
import java.util.*;

public class PYQMonkeyCounting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mBC = sc.nextInt();
        int mPC = sc.nextInt();
        int totalB = sc.nextInt();
        int totalP = sc.nextInt();
        int count = 0;
        while(totalB >= mBC){
            totalB = totalB - mBC;
            count++;
        }
        while(totalP >= mPC){
            totalP -= mPC;
            count++;
        }
        if(totalB% mBC != 0 || totalP%mPC != 0){
            count++;
        }

        int result = n - count;
        System.out.println("total no. of monkey on tree : " + result);
    }
}
