class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);

            String sorted = new String(c);
            if (anagrams.containsKey(sorted)) {
                List<String> values = anagrams.get(sorted);
                values.add(str);

                anagrams.put(sorted, values);
            } else {
                List<String> values = new ArrayList<>();
                values.add(str);

                anagrams.put(sorted, values);
            }
        }
        return anagrams.values()
                .stream()
                .toList();
    }
}
