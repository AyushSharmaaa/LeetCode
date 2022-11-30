class Solution {
   public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (nums.length<=1){
            return arr;
        }
        Set<Integer> visited = new HashSet<>();
        for (int i=0; i<nums.length; i++){
            if (visited.add(nums[i])){

            }
            else {
                arr.add(nums[i]);
            }
        }
        return arr;
    }
}