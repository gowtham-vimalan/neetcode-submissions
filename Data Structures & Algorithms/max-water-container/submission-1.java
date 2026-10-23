class Solution {
    public static int maxArea(int[] heights) {
        int maxArea = 0;

        int start = 0;
        int end = heights.length - 1;

        while (start < end) {
            int breadth = end - start;
            int height = Math.min(heights[start], heights[end]);

            maxArea = Math.max(maxArea, breadth * height);

            if(heights[start] < heights[end]){
                start ++;
            }else{
                end--;
            }

        }
        return maxArea;
    }
}
