class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> freq.get(b) - freq.get(a));
        for(int i : freq.keySet()){
            queue.add(i);
        }
        for(int i=0;i<k;i++){
            res[i] = queue.poll();
        }


        return res;
    }
}
