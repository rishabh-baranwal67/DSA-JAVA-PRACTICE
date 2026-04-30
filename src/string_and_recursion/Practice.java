package string_and_recursion;

public class Practice {
    public static void main(String[] args) {
        String str = "aaabbccc";
        String avg = checkAvg(str);
        System.out.println(avg);
    }
    public static String checkAvg(String str){
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; ){
            int count = 0;
            char ch = str.charAt(i);
            while(i < n && ch == str.charAt(i)){
                count++;
                i++;
            }
            sb.append(ch);
            if(count > 1){
                sb.append(String.valueOf(count));
            }
        }
        return new String(sb);
    }
//    public static double checkAvg(String str){
//        int sum = 0;
//        int count = 0;
//        int num = 0;
//        int n = str.length();
//        for(char ch : str.toCharArray()){
//            if(Character.isDigit(ch)){
//                num = num * 10 + (ch - '0');
//            }
//            else{
//                if(num > 0){
//                    sum += num;
//                    count++;
//                    num = 0;
//                }
//            }
//        }
//        if(num > 0){
//            sum += num;
//            count++;
//        }
//
//        return (double) sum;
//    }
}
