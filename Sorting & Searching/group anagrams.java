//Leetcode Q-49
//CCI - Chapter 10 - Q2
//Group Anagrams
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String s: strs) {
            String key = sort(s);
            if(!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        List<List<String>> ans = new ArrayList<>();
        for(String key: map.keySet()) {
            List<String> list = map.get(key);
            ans.add(list);
        }
        return ans;
    }
    
    private String sort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}