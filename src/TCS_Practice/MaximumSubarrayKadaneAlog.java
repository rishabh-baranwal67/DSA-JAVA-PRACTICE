package TCS_Practice;
import java.util.*;

public class MaximumSubarrayKadaneAlog {
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] result = kadane(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] kadane(int[] nums){
        int n = nums.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int l = 0, r = 0, subStart = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(sum > maxSum){
                maxSum = sum;
                l = subStart;
                r = i;
            }
            if(sum < 0){
                sum = 0;
                subStart = i+1;
            }
        }
        int[] resArr = new int[r-l+1];
        int k = 0;
        for(int i = l; i <= r; i++){
            resArr[k++] = nums[i];
        }
        System.out.println("the sum of maximum subarray : "+ maxSum);
        return resArr;
    }
}
