class Solution {
    public static boolean isAnagram(String s, String t) {
       char arr1[] = s.toCharArray();
       char arr2[] = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        s = String.copyValueOf(arr1);
        t = String.copyValueOf(arr2);
        int count = s.compareTo(t);
        if (count==0){
            return true;
        }
        else {
            return false;
        }
    }
}