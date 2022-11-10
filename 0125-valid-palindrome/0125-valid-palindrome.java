class Solution {
  public static boolean isPalindrome(String s) {
        String palindromStr = "";
        s = s.toLowerCase();
        s = s.trim();
        s = s.replaceAll("\s","");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        for (int i=s.length()-1; i>=0;i--){
           palindromStr = palindromStr + s.charAt(i);
        }
        int num = s.compareTo(palindromStr);
        if (num==0){
            return true;
        }
        else {
            return false;
        }
  }
}