class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i : nums) {
            priorityQueue.add(i);
            if(priorityQueue.size() > k){
                priorityQueue.poll();
            }
        }
        
        return priorityQueue.peek();
    }
}
