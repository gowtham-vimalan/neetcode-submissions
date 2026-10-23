class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int start = 0;
        while (start < str.length()) {
            int j = start;
            while (str.charAt(start) != '#') {
                start++;
            }
            int length = Integer.parseInt(str.substring(j, start));
            String decoded = str.substring(start + 1, start + length + 1);
            list.add(decoded);

            start = start + 1 + length;
        }
        return list;
    }
}
