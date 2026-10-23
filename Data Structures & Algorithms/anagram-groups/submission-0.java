class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        
        for (String str : strs) {
            // Sort the string to generate a key
            char[] strChars = str.toCharArray();
            Arrays.sort(strChars);
            String sorted = new String(strChars);

            // Add the string to the corresponding group
            anagrams.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagrams.values());

    }
}
