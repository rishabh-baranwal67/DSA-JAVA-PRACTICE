package string_and_recursion;

public class Stream {

    //  Removing occurrence of a character from string
    public static void main(String[] args) {
//        skip("", "baccdah");
        System.out.println(skipApple("bbccaaapplesdg", "apple"));
    }

    static String skipApple(String up, String str) {
        if (up.isEmpty()) {
            return "";
        }
        int n = str.length();
        if (up.startsWith(str)) {
            return skipApple(up.substring(n),str);
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1), str);
        }
    }
}
//    static void skip(String p, String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        char ch = up.charAt(0);
//        if(ch == 'a'){
//            skip(p, up.substring(1));
//        }
//        else{
//            skip(p + ch, up.substring(1));
//        }