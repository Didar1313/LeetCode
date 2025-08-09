import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
public class FindPosition {
    public static void main(String[] args) {
        final int[] nums={5,7,7,8,8,10};
        final int target=6;
        Solution solution=new Solution();
        final int[] result = solution.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {

        ArrayList<Integer> arrayList = Arrays.stream(nums)
                                             .boxed()      
                                             .collect(Collectors.toCollection(ArrayList::new));
        int first = arrayList.indexOf(target);
        int last = arrayList.lastIndexOf(target);
        System.out.println(first);

        return new int[]{first, last};
    }
}