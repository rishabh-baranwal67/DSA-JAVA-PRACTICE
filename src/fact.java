public class fact {
    public static void main(String[] args) {
        System.out.println(count(2030004208));
    }
    public static int count(int n     ){
        return helper(n, 0);
    }
    public static int helper(int n,int count){
        if(n == 0){
            return count;
        }
        int rem = n%10;
        if(rem == 0 ){
            return helper(n/10, count+1);
        }
        else{
            return helper(n/10, count);
        }
    }
}
//
//    //  REVERSE A NUMBER USING RECURSION
//    static int sum  = 0;
//    static void reverse(int n){
//        if(n== 0){
//            return ;
//        }
//        int rem =  n %10;
//        sum = sum * 10 + rem;
//        reverse(n/10);
////        return (rem * 10) + reverse(n/10);
//    }
//
//    public static void CollectionsClass(String[] args) {
////        int ans = sum(2345);
//        reverse(1482);
//        System.out.println(sum);
//    }
//
//
//
////    static int sum(int n ){
////        if(n == 0){
////            return n;
////        }
////        int mod = n%10;
////        return mod + sum(n/10);
////    }  1842
//
////    public static int fact(int n ){
////        if(n == 1){
////            return 1;
////        }
//////        int result = ();;
//////        System.out.println(result);
////
////        return n * fact(n-1);
////    }
//}
