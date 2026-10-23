class Solution {
        public static List<List<Integer>> threeSum(int[] array) {
        Arrays.sort(array);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i > 0 && array[i] == array[i - 1]) continue;
            int ele = array[i];
            int left = i + 1;
            int right = array.length - 1;

            int valueToMatch = 0 - ele;

            while (left < right) {
                if (array[right] + array[left] == valueToMatch) {
                    res.add(List.of(ele, array[left], array[right]));

                    while (left < right && array[left + 1] == array[left]) {
                        left++;
                    }

                    while (left < right && array[right - 1] == array[right]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (array[right] + array[left] > valueToMatch) {
                    right--;
                } else {
                    left++;
                }
            }

        }


        return res;
    }
}
