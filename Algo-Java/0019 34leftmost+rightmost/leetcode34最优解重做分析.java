// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/ 

// 用了一个多小时去理解, 是不是笨啊 😮‍💨 
// 答案通过. 

class Solution {
    public int[] searchRange(int[] a, int target) { // leftmost + right most

        int x = leftRight(a, target, true);
        int y = leftRight(a, target, false);
        return new int[] { x, y };
    }

    public int leftRight(int[] a, int target, boolean isLeft) {
        // i j
        int i = 0, j = a.length - 1;
        int result = -1;

        while (i <= j) { // leftmost
            int m = (i + j) >>> 1;

            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else { // a[m] = target // index 是 m 的时候, a[m]就都等于target, 所以 m 为所求index. 
                if (isLeft) { // 向左找, 缩小右边界j 
                    // i还是为leftmost. chatgpt提供一些思路, 但是一部分答案是骗人的, 是乱说的, 还得人来思考. 
                    j = m - 1; 
                } else { // 向右找, 缩小左边界i
                    // 所以右边界是什么? i一直based on m 在增加, i=j时候,m也=i=j了, i还是加了1, 到大于j停下. 所以j是rightmost, i比j大了1, 就是j=rightmost=i-1. 但是m停在了i=j=m的位置. 所以m在范围里. 
                    i = m + 1; 
                }
                result = m; // 两个条件都是 m , 因为a[m]是一个匹配 
            }
        }
        return result;
    }

}
