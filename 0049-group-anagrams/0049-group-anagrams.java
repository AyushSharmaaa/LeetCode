class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, LinkedList<String>> map = new HashMap<>();
        for (String str : strs){
            char charArr[] = str.toCharArray();
            Arrays.sort(charArr);
            String stored = new String(charArr);

            if (!map.containsKey(stored)){
                map.put(stored,new LinkedList<String>());
            }
            map.get(stored).add(str);
        }

        return new LinkedList<>(map.values());
    }
}