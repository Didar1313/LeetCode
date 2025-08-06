import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        final int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        final int val = 2;

        Solution solution = new Solution();
        int size = solution.removeElement(nums, val);

        System.out.println(size);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, size)));

    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
