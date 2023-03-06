class Solution {
      public static int findKthPositive(int[] arr, int k) {
        int x=0; //index of arr[]
        ArrayList<Integer> list = new ArrayList<>(); //Array list stores the element which is missing in arr[]

        //Loop for comparing k positive integer with arr[]
        for (int i=1; i<arr[arr.length-1]; i++){
            //check arr[x] is equal to positive integer (i)
            if (arr[x]==i){
                x++;
            }
            //add missing integer value in list
            else {
                list.add(i);
            }
        }
        //k is greater than list size
        if (list.size()<k){
            k=k-list.size();
            return arr[arr.length-1]+k;
        }
        //return the kth missing positive integer
        else {
            return list.get(k-1);
        }
    }
}