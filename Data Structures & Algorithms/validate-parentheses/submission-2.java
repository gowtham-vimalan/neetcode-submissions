class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (List.of('[', '{', '(').contains(c)) {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }else if (c == ']' && stack.pop() != '[') {
                    return false;
                } else if (c == '}' && stack.pop() != '{') {
                    return false;
                } else if (c == ')' && stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
