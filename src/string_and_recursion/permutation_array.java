package string_and_recursion;
import java.util.*;
public class permutation_array {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));

    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generatePermutations(nums, 0, result);
        return result;
    }

    public static void generatePermutations(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length - 1) {
            List<Integer> list = new ArrayList<>();

            for (int num : nums) {
                list.add(num);
            }

            result.add(list);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            generatePermutations(nums, start + 1, result);
            swap(nums, start, i);
        }
    }

    public static void swap(int[] nums, int start, int i) {
        int temp = nums[i];
        nums[i] = nums[start];
        nums[start] = temp;
    }
}
// MY SOLUTION
//
//static ArrayList<ArrayList<Integer>> permutationList(ArrayList<Integer> p, ArrayList<Integer> up) {
//    if (up.isEmpty()) {
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        list.add(new ArrayList<>(p)); // Add a copy of p
//        return list;
//    }
//
//    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//    int num = up.get(0);
//    ArrayList<Integer> remaining = new ArrayList<>(up.subList(1, up.size()));
//
//    for (int i = 0; i <= p.size(); i++) {
//        ArrayList<Integer> f = new ArrayList<>(p.subList(0, i));
//        ArrayList<Integer> s = new ArrayList<>(p.subList(i, p.size()));
//
//        ArrayList<Integer> newList = new ArrayList<>();
//        newList.addAll(f);
//        newList.add(num);
//        newList.addAll(s);
//
//        ans.addAll(permutationList(newList, remaining));
//    }
//
//    return ans;
//}
//
//public static void main(String[] args) {
//    ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
//    ArrayList<ArrayList<Integer>> result = permutationList(new ArrayList<>(), input);
//
//    for (ArrayList<Integer> perm : result) {
//        System.out.println(perm);
//    }
//}