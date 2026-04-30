package string_and_recursion;

import access.A;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        permutation("", "abc");
        System.out.println(permutationlist("", "abc"));
    }
    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++) {
             String f = p.substring(0,i);
             String s = p.substring(i, p.length());
             permutation( f + ch + s, up.substring(1));
        }
    }
    static ArrayList<String> permutationlist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
//            System.out.println(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
             ans.addAll(permutationlist( f + ch + s, up.substring(1)));
            System.out.println(ans);
        }
        return ans;
    }
}
