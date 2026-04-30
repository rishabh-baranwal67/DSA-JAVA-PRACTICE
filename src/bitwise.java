import java.util.*;
public class bitwise {
    int a = 10;
    int b = 12;
    public int add(){
        int total = a+ b;
        return total;
    }
    public static void main(String[] args) {
        bitwise obj = new bitwise();
//        System.out.println(obj.add());
        System.out.println(obj.add());
//
//        int n = 7;
//        int b = 2;
//        int count = (int)(Math.log(n)/ Math.log(b)) + 1;
//        System.out.println(count);

//        int[] arr = {2,2,3,2};
//        System.out.println(singleNumber(arr));
//            Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt();
//        int num = 7;
//        num = num << 1;
//        System.out.println(num);
//        num = num >> 1;
//        System.out.println(num);
//        if((num & 1) == 0){
//            System.out.println("even");
//        }
//        else{
//            System.out.println("odd");
//        }

    }
//    public static int singleNumber(int[] nums) {
//        int ones = 0; int twos = 0;
//        for(int num : nums){
//            ones = (ones ^ num ) & ~twos;
//            twos = (twos ^ num) & ~ones;
//        }
//        return ones;
//    }
}
