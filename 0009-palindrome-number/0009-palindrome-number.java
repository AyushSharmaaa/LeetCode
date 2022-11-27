class Solution {
   public static boolean isPalindrome(int num) {
        int num2 = num;
        int rev = 0;
       if (num<0){
            return false;
        }
        while (num!=0){
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        if (num2==rev){
           return true;
        }
        else {
            return false;
        }
    }
}