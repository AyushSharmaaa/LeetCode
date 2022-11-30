class Solution {
   public static int lengthOfLastWord(String s) {
        String word[] = s.split("\s");
        String lastWord = word[word.length-1];
        return lastWord.length();
    }
}