// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/ 

// 我还是有错误代码, 在leetcode上面, 刷了十几遍, 全是错误的代码. 88个测试, 总有卡住的, 所以下面的的确是错误代码. 

class Solution {
    public int[] searchRange(int[] a, int target) { // leftmost + right most
        int x = left(a, target);
        int y = right(a, target);
        return new int[] { x, y };
    }

    public int left(int[] a, int target) {
        // i j
        int i = 0, j = a.length - 1;
        while (i <= j) { // leftmost
            int m = (i + j) >>> 1;

            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else { // a[m] = target // 只要相等就减小j
                j = m - 1; // i is leftmost
                return i; // chatgpt告诉我这里应该在while 的外面 //其实我错了, ChatGPT是对的. 
            }
        }
        return -1;
    }

    public int right(int[] a, int target) {
        int i = 0, j = a.length - 1;
        while (i <= j) { // rightmost
            int m = (i + j) >>> 1;

            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else { // 1 2 3 3 3 3 4
                i = m + 1; // j is right most
                return j - 1; // j是大于i那个, i得是j-1.
            }
        }
        return -1;
    }
}
