
import java.util.ArrayList;
import java.util.List;

public class Permutation {
    static void solve(int ind, int[] nums, List<List<Integer>> ans) {
        int n = nums.length;
        if (ind == n) {
            List<Integer> temp1 = new ArrayList<>();
            for (int num : nums)
                temp1.add(num);
            ans.add(temp1);
            return;

        }
        for (int i = ind; i < n; i++) {
            int temp = nums[ind];
            nums[ind] = nums[i];
            nums[i] = temp;

            solve(ind + 1, nums, ans);
            int temp2 = nums[ind];
            nums[ind] = nums[i];
            nums[i] = temp2;

        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        solve(0, nums, ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(permute(nums));

    }

}
import java.util.ArrayList;
import java.util.List;

public class Permutation {
    static void solve(int ind, int[] nums, List<List<Integer>> ans) {
        int n = nums.length;
        if (ind == n) {
            List<Integer> temp1 = new ArrayList<>();
            for (int num : nums)
                temp1.add(num);
            ans.add(temp1);
            return;

        }
        for (int i = ind; i < n; i++) {
            int temp = nums[ind];
            nums[ind] = nums[i];
            nums[i] = temp;

            solve(ind + 1, nums, ans);
            int temp2 = nums[ind];
            nums[ind] = nums[i];
            nums[i] = temp2;

        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        solve(0, nums, ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(permute(nums));

    }

}
