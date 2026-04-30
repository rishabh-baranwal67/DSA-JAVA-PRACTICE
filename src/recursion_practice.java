import java.lang.reflect.Array;
import java.util.ArrayList;

public class recursion_practice {
    public static void main(String[] args) {
      int[] arr = {2,3,1,4,4,5};
        System.out.println(findAllindex2(arr,4,0));
    }
   static ArrayList<Integer> findAllindex2(int[] arr, int target, int index){
        ArrayList<Integer>  list = new ArrayList<>();
        if(index == arr.length){
            return  list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer>  endBelow = findAllindex2(arr, target, index+1);

        list.addAll(endBelow);
        return list;
   }
}
//PROGRAM TO FIND AN ELEMENT IN AN ARRAY USING RECURSION
//
//int[] arr = {41,27,14,82,9,12};
//boolean res = find(arr,12, 0);
//      System.out.println(res);
//    }
//public static boolean find(int[] arr,int target, int i){
//    if(i == arr.length ){
//        return false;
//    }
//
//
//    return arr[i] == target || find(arr,target,i+1);
//

// PROGRAM TO CHECK AN ARRAY IS SORTED OR NOT USING RECURSION
//int[] arr = {41,27,14,82,9,12};
//boolean res = sorted(arr, 0);
//
//        System.out.println(res);
//
//    }
//public static boolean sorted(int[] arr, int i){
//    if(arr[i] == arr[arr.length - 1]) return true;
//
//    return arr[i] < arr[i+1] && sorted(arr,i+1);



//        Program to reverse a number using Recursion in Java?
//        int a = 123456789;
//        int rem = a%10;
//        // a = a/10;
//        int result = reverse(a/10, rem);
//        System.out.println(result);
//    }
//    static  int reverse(int n ,int rem ){
//        if(n<1){
//            return rem;
//        }
//
//        System.out.print(rem);
//
//        return  reverse(n/10 , n%10);


//
//    }

//    static void reverse(String str) {
//


//        Write a program to reverse String in Java using Recursion.
////        original String: HelloWorld, reversed String dlroWolleH
////        original String: WakeUp, reversed String pUekaW
////        original String: Band, reversed String dnaB
//        String str = "Rishabh";
//        String result = reverse( str,"", str.length() - 1);
//        System.out.println( result);
//        }
//        static String reverse(String str , String ans ,int i){
//        if(i<0){
//            return ans;
//        }
//
//            ans = ans + str.charAt(i);
//            return reverse(str, ans, i-1);
