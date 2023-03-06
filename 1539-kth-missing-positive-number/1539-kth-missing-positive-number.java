class Solution {
     public static int findKthPositive(int[] arr, int k) {
        int x=0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i<arr[arr.length-1]; i++){
            if (arr[x]==i){
                x++;
            }
            else {
                list.add(i);
            }
        }
        System.out.print(list);
        if (list.size()<k){
            k=k-list.size();
            return arr[arr.length-1]+k;
        }
        else {
            return list.get(k-1);
        }
    }
}