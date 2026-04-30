package TCS_Practice;
import java.util.*;

public class PYQ1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sCount = 0;
        int hCount = 0;
        for(char ch : s.toCharArray()){
            if(ch == '*'){
                sCount++;
            }
            else{
                hCount++;
            }
        }
        System.out.println(sCount - hCount);
        sc.close();
    }
}
