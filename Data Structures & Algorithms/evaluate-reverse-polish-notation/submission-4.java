class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for (String token : tokens) {
            if (List.of("+", "-", "*", "/").contains(token)) {
                int right = s.pop();
                int left = s.pop();

                int result;
                if (token.equals("+")) {
                    result = left + right;
                } else if (token.equals("*")) {
                    result = left * right;
                } else if (token.equals("-")) {
                    result = left - right;
                } else {
                    result = left / right;
                }
                s.push(result);
            } else {
                s.push(Integer.parseInt(token));
            }
        }
        return s.pop();
    }
}
