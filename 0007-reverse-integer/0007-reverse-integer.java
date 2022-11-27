class Solution {
    public static int reverse(int num) {
        long rev = 0;
        while (num!=0){
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
         if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) rev;
    }
}