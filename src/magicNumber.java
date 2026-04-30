public class magicNumber {
    public static void main(String[] args) {
        int n = 64;
        int b = 2;
        int ans = (int) (Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
//        int n = 6;
//        int ans = 0;
//        int base = 5;
//        while(n>0){
//            int last = n & 1;
//             ans +=  last * base;
//             n = n >> 1;
//             base = base * 5;
//        }
//        System.out.println(ans);
    }
}
