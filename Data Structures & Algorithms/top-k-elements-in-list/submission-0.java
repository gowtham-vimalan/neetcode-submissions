class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i: nums){
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
            
        }

        PriorityQueue<Integer> q = new PriorityQueue<>((k1, k2) -> map.get(k2) - map.get(k1));
        for(Integer i : map.keySet()) {
            q.add(i);
        }
        
        int[] arr = new int[k];
        for(int i=0; i<k; i++){
            arr[i] = q.poll();
        }
        return arr;

    }
}
