class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);

            String sortedStr = new String(arr);
            if (anagrams.containsKey(sortedStr)) {
                List<String> group = anagrams.get(sortedStr);
                group.add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                anagrams.put(sortedStr, list);
            }
        }
        return anagrams.values().stream().toList();
    }
}
