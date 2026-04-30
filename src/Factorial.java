import java.math.BigInteger;
import java.io.File;
import java.io.FileInputStream;

public class Factorial {
    int d;
    public static BigInteger fact(int n){
        int a = 1_2_3;
        double b = 1_2.04743_34_343;

        System.out.println(b);
        BigInteger num = new BigInteger("1");

        for(int i = 2; i <= n; i++){
            num = num.multiply(BigInteger.valueOf(i));
        }
        return num;
    }

    public static void main(String[] args) {
        BigInteger faact = fact(11);
        System.out.println(faact);

        int v,s;
        v = 123;
        Factorial obj = new Factorial();
        System.out.println(obj.d);
//        System.out.println(d);
    }
}
