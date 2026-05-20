package infosys;
import java.util.*;

public class pyq2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        for(int i = 2; i < n+1; i++){
            if((i%2) == 0){
                nums[i] = nums[i/2];
            }
            else if((i%2) != 0){
                nums[i] = nums[i/2] + nums[(i/2) +1];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
