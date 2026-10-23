class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!s.isEmpty()) {
                Integer peek = s.peek();
                if (!(temperatures[peek] < temperatures[i])) break;
                output[peek] = i - peek;
                s.pop();
            }
            s.push(i);
        }


        return output;

    }
}
