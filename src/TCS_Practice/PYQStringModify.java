package TCS_Practice;
import java.util.*;

public class PYQStringModify {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        char currChar = ' ';
        for(char ch : s.toCharArray()){
            if(currChar == ch){
                continue;
            }
            if(currChar != ch){
                sb.append(String.valueOf(ch));
                currChar = ch;
            }
        }
        System.out.println(sb.toString());
    }
}
