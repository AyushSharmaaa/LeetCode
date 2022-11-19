class Solution {
    public static int fib(int n) {
        int arr[] = new int[n+2];
        int index=0;
        arr[0]=0;
        arr[1]=1;
        for (int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
            if (n==1){
                return arr[1];
            }
            if (n==i){
                index=i;
            }
        }
        return arr[index];
    }
}