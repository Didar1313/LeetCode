import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        final int[] a = {1, 2};
        final int[] b = {3,4};
        Solution solution = new Solution();
        double result = solution.findMedianSortedArrays(a, b);
        System.out.printf("[%.5f]",result);
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);

        int n = merged.length;
        if (n % 2 == 1) {
            return merged[n / 2]; 
        } else {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0; 
        }
    }
}
