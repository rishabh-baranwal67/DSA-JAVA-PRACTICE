package infosys;
import java.util.*;
import java.io.*;

public class que1PYQ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String digit = sc.nextLine();

        int n = num.length();
        int maxNum = 0;
        StringBuilder sb = new StringBuilder(num);

        for(int i = 0; i < n; i++){
            char ch = sb.charAt(i);
            String str = String.valueOf(ch);
            System.out.println("char : " + ch);
            if(str.equals(digit)){
//                sb = sb.deleteCharAt(i);
                String temp = String.valueOf(sb);
                maxNum = Math.max(Integer.parseInt(String.valueOf(sb)), maxNum);
                System.out.println(i);
            }
            System.out.println("Stringbuilder :" + sb);

            sb = new StringBuilder(num);
        }
        System.out.println(maxNum);
    }
}
