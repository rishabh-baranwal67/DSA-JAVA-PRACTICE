package TCS_Practice;
import java.util.*;

public class PrimeNumberSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int i = 0;
        if(n <= 1){
            System.out.println("there is no prime number");
            return;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 2; i > 0 && n> 0; i ++){
            boolean isPrime = isPrime(i);
            if(isPrime){
                n--;
                list.add(i);
            }
        }
        int sum = 0;
        for(int num : list){
            sum += num;
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int num){
        for(int i = 2; i * i <= num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
