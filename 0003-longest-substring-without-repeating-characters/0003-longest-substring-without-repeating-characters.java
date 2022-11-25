class Solution {
     public static int lengthOfLongestSubstring(String s) {
       int left = 0;
       int right = 0;
       int max = 0;
        Set<Character> visited = new HashSet<>();
        while (right<s.length()){
            char c = s.charAt(right);
            if (visited.add(c)){

                max = Math.max(max,right-left+1);
                right++;
            }
            else {
                while (s.charAt(left)!=c){
                    visited.remove(s.charAt(left));
                    left++;
                }
                //remove actual char
                visited.remove(c);
                left++;
            }
        }
        return max;
    }
}