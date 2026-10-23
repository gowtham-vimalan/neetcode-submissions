class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            encoded.append(s.length()).append("#").append(s);
        }
        return encoded.toString();
    }
    
    // Decode the encoded string back into a list of strings
    public List<String> decode(String encodedStr) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < encodedStr.length()) {
            // Find the position of the next '#', which separates the length from the string
            int j = encodedStr.indexOf('#', i);
            int length = Integer.parseInt(encodedStr.substring(i, j));  // Extract the length of the string
            result.add(encodedStr.substring(j + 1, j + 1 + length));  // Extract the actual string based on the length
            i = j + 1 + length;  // Move the index forward for the next string
        }
        return result;
    }
}
