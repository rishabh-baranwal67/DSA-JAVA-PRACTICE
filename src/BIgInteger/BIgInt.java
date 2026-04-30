package BIgInteger;
import java.math.BigInteger;

public class BIgInt {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(9);
        BigInteger b = new BigInteger("3234403670346703472002856080825839257923565456299235987598347583942524524532545325245253");
        BigInteger c = new BigInteger("435256232352523452354324131424189798343241242091927409183720495258072358728935732524");

        BigInteger d = c.add(b);
        BigInteger e = c.multiply(b);
        boolean f = b.equals(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
