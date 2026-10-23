class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int totalCars = position.length;
        int[][] pair = new int[totalCars][2];
        for (int i = 0; i < position.length; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, (a, b) -> b[0] - a[0]);

        Stack<Double> s = new Stack<>();
        for (int i = 0; i < totalCars; i++) {
            double time = (double) (target - pair[i][0]) / pair[i][1];
            if (!s.isEmpty() && s.peek() >= time) {
                continue;
            } else {
                s.push(time);
            }
        }

        return s.size();
    }
}
