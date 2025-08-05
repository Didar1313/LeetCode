import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        final int[] triplets={-1,0,1,2,-1,-4};
        Solution solution=new Solution();
        List<List<Integer>>res = solution.threeSum(triplets);
        System.out.println(res);

    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0; i<nums.length-2; i++){
            Set<Integer> seen = new HashSet<>();
            for(int j=i+1; j<nums.length; j++){
                int com=-nums[i]-nums[j];
                if(seen.contains(com)){
                    List<Integer>triplets=Arrays.asList(nums[i],nums[j],com);
                    triplets.sort(Integer::compareTo);
                    result.add(triplets);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(result);
    }
}