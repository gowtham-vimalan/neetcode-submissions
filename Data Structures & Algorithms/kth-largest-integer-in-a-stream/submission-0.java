class KthLargest {

    int kthLargestNumber;
    PriorityQueue<Integer> queue = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        kthLargestNumber = k;
        for (int num : nums) {
            queue.add(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }

    }
    
    public int add(int val) {
        queue.add(val);
        if (queue.size() > kthLargestNumber) {
            queue.poll();
        }
        return queue.peek();
    }
}
