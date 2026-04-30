package string_and_recursion;

import java.util.ArrayList;

public class subSeq {
    public static void main(String[] args) {
//        subseq("", "abc");
        System.out.println(subseqRet("", "abc"));
    }
    // FOR PRINTING ALL SUBSETS OF A STRING
//    static void subseq(String p, String up){
//        if(up.isEmpty()){
//            System.out.print(p + " ");
//            return;
//        }
//        char ch = up.charAt(0);
//        subseq(p + ch, up.substring(1));
//        subseq(p, up.substring(1));
//    }

    // FOR PRINTING ALL SUBSET OF A STRING IN AN ARRAYLIST
static ArrayList<String> subseqRet(String p, String up){
    if(up.isEmpty()){
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
    }
    char ch = up.charAt(0);
    ArrayList<String> left = subseqRet(p + ch, up.substring(1));
    ArrayList<String> right = subseqRet(p, up.substring(1));

    left.addAll(right);
    return left;
}
}
