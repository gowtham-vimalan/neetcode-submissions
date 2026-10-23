class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);

            String sorted = new String(c);
            anagrams.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }
        return anagrams.values()
                .stream()
                .toList();
    }
}