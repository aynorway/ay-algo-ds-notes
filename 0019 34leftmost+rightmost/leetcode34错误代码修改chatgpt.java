// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/ 

// 提交成功的代码 
// 正确代码


class Solution {
    public int[] searchRange(int[] a, int target) { // leftmost + right most
        int x = left(a, target);
        int y = right(a, target);
        // if ( x != -1 && y < 0) { y = 0 ;}
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
                // return i; // chatgpt告诉我这里应该在while 的外面, 然后i 恒=0. 你说这东西是不是不能信. 唉.// 打脸很快, ChatGPT是对的.
            }
        }
        if (i < a.length && a[i] == target) return i;
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
                // return m; // j是大于i那个, i得是j-1.
            }
        }
        if (j >= 0 && a[j] == target) return j;
        return -1;
    }
}

// 1 1 1 1 1 4 5 6 7 
// 比如说找2 
// a[m] < target right zone , so increase i 
// i = m + 1 
// 此时如果求最小i，缩小j
// 条件：另a[m]=target,(全是相同的target)
// 此时i都是小于j的 
// j依靠m缩小 
// 此时求出来了一个最小的j






