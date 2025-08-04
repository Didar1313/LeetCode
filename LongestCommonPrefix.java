public class LongestCommonPrefix {

    public static void main(String[] args) {
        final String[] strs = {"flower","flow","flight"};
        Solution solution=new Solution();
        final String result = solution.longestCommonPrefix(strs);
        System.out.println(result);
        
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String prefix=strs[0];
        for(int i=1; i<strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
            }
            if(prefix.isEmpty()){
                return "";
            }
        }
        return prefix;
    }
}