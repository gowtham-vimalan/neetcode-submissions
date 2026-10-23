class Solution {
    public boolean isAnagram(String s, String t) {
      char[] sChar = s.toCharArray();
      char[] tChar = t.toCharArray();

      Arrays.sort(sChar);
      Arrays.sort(tChar);

      if(new String(sChar).equals(new String(tChar))) {
        return true;
      }
      return false;

    }
}
