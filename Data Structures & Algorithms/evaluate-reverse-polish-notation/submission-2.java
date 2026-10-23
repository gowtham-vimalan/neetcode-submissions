class Solution {
        public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            if (List.of("+", "-", "*", "/").contains(str)) {
                int right = stack.pop();
                int left = stack.pop();
                switch (str) {
                    case "+" -> stack.push(left + right);
                    case "*" -> stack.push(left * right);
                    case "-" -> stack.push(left - right);
                    case "/" -> stack.push(left / right);
                }
            } else {
                stack.add(Integer.parseInt(str));
            }

        }
        return stack.pop();
    }
}
