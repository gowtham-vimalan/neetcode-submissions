class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Queue<Integer> s = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        s.addAll(map.keySet());

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = s.poll();
        }

        return res;

    }
}