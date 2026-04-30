package TCS_Practice;
import java.util.*;

public class checkSpeed {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int t = sc.nextInt();
        double speed = (double)d/t * 3.6;
        System.out.println("speed in km/h is : " + speed);
    }
}
