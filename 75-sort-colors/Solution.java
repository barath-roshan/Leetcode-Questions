class Solution {
    public void sortColors(int[] nums) {
        int r = 0, w = 0, b = 0;

        for (int num : nums) {
            if (num == 0) r++;
            else if (num == 1) w++;
            else b++;
        }

        int index = 0;
        for (int i = 0; i < r; i++) nums[index++] = 0;
        for (int i = 0; i < w; i++) nums[index++] = 1;
        for (int i = 0; i < b; i++) nums[index++] = 2;
    }
}
