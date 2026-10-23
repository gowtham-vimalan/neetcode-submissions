class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        String c = s.toLowerCase();

        while (start <= end) {
            if (!Character.isLetterOrDigit(c.charAt(start))) {
                start++;
                continue;
            }

            if (!Character.isLetterOrDigit(c.charAt(end))) {
                end--;
                continue;
            }

            if (c.charAt(start) != c.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}
