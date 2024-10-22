
import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static void solve(int ind, int[] nums, List<Integer> ls, List<List<Integer>> ans) {
        int n = nums.length;
        if (ind >= n) {
            ans.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[ind]);
        solve(ind + 1, nums, ls, ans);
        ls.remove(ls.size() - 1);
        solve(ind + 1, nums, ls, ans);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        solve(0, nums, ls, ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(subsets(nums));

    }

}
