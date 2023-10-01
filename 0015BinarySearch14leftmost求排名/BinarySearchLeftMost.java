public class BinarySearchLeftMost {
    // Params: a数组，int target 目标值
    // returns: 目标索引，没找到返回-1

    public static int binarySearchLeftMost(int[] a, int target) {
        int i = 0;
        int j = a.length - 1;

        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target <= a[m]) {
                j = m - 1;
            } else {
                i = m + 1;

            }
        }
        return i; // 修改返回i, 含义: candidate 不要了. 
        // 为什么返回i更有用? 
        // 找到 target, i 是最左的
        // 没找到 target, i 是大于等于目标的, 最靠左的位置 

    }
}

// 求前任 leftmost - 1
// 求后任 rightmost + 1