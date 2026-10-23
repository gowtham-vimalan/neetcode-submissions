    class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int end = Arrays.stream(piles).max().getAsInt();
        int start = 1;

        int finalRate = Integer.MAX_VALUE;
        while (start <= end) {
            int currentRate = (start + end) / 2;
            int totalHours = 0;
            for (int pile : piles) {
                totalHours += (int) Math.ceil((double) pile / currentRate);
            }

            if (totalHours <= h) {
                finalRate = Math.min(finalRate, currentRate);
                end = currentRate - 1;
            } else {
                start = currentRate + 1;
            }


        }

        return finalRate;
    }
    }
