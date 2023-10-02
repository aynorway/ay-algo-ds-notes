// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/ 

// 又漂亮, 又简短, 😮‍💨 

class Solution {
    public int[] searchRange(int[] a, int target) {
        int x = findBound(a, target, true);
        int y = findBound(a, target, false);
        return new int[] { x, y };
    }

    public int findBound(int[] a, int target, boolean isLeft) {
        int i = 0, j = a.length - 1;
        int result = -1;
        
        while (i <= j) {
            int m = (i + j) >>> 1;
            
            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                result = m;
                if (isLeft) {
                    j = m - 1; // 移动到左边去寻找左边界
                } else {
                    i = m + 1; // 移动到右边去寻找右边界
                }
            }
        }
        return result;
    }
}