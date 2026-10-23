class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;

        int maxArea = 0;

        while (start < end) {
            int height = Math.min(heights[start], heights[end]);
            int breadth = end - start;

            int area = height * breadth;
            maxArea = Math.max(area, maxArea);

            if (heights[start] < heights[end]) {
                start++;
            } else {
                end--;
            }

        }

        return maxArea;

    }
}
