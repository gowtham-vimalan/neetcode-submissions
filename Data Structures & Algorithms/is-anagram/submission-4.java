class Solution {
        public boolean isAnagram(String s, String t) {
        if (!isStringsOfSameLength(s, t)) {
            return false;
        }

        int[] count = new int[26];
        for (char a : s.toCharArray()) {
            int idx = a - 97;
            count[idx]++;
        }
        for (char a : t.toCharArray()) {
            int idx = a - 97;
            count[idx]--;
        }
        for (int val : count) {
            if (val > 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isStringsOfSameLength(String s, String t) {
        return s.length() == t.length();
    }
}
