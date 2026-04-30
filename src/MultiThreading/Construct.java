package MultiThreading;

import java.util.ArrayList;
import java.util.Arrays;

public class Construct {
    int a ;
    public Construct(int a){
        this.a = a;
    }
    public Construct(){
        System.out.println("Constructor is called");
    }
}
 class Rb{
     void m1(){
        System.out.println("from m1");
    }
     public static void main(String[] args) {
         int ab = 10;
         String strr = Integer.toBinaryString(ab);
         System.out.println(strr);
         Rb obj5 = new Rb();
           obj5.array();
//         Construct obj = new Construct(100);
//         System.out.println(obj.a);
//         Construct obj2 = new Construct();
//         System.out.println();
         Construct obj3 = new Construct();

         int digit = 124;
         String str = digit + "";
         System.out.println(str.charAt(1));
         Rb obj = new Rb();
         obj.m1();
     }
     public Object[] array(){
         ArrayList<Integer> list = new ArrayList<>();
         for (int i = 0; i < 10; i++) {
             list.add(i);
         }
         Object[] arr = list.toArray();
         System.out.println(Arrays.toString(arr));
         return arr;
     }
}
