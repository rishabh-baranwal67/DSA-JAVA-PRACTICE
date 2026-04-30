package TCS_Practice;
import java.util.*;

public class MinimumSubArraySum {
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,-1,-5,4};
        int[] result = kadane(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] kadane(int[] nums){
        int n = nums.length;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
//        int l = 0, r = 0, subStart = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];

            minSum = Math.min(sum, minSum);
            if(sum > 0){
                sum = 0;
            }
        }
        System.out.println("the sum of maximum subarray : "+ minSum);
        return new int[6];
    }
}
