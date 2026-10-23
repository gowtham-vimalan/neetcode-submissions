class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate current area
            int currentHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int area = currentHeight * width;

            // Update max area if needed
            maxArea = Math.max(maxArea, area);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
