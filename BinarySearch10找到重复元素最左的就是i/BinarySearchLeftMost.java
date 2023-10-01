public class BinarySearchLeftMost {
    // Params: a数组，int target 目标值
    // returns: 目标索引，没找到返回-1

    public static int binarySearchLeftMost(int[] a, int target) {
        int i = 0;
        int j = a.length - 1;
        int candidate = -1; // 表示没有任何候选者 

        while (i <= j) {
            int m = (i + j) / 2;
            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                // 记录候选位置 
                candidate = m; 
                // 缩小j边界, 如果遇到新的m, 又进入else, 直到 i>j 结束 
                j = m - 1; 
            }
        }
        return i;

    }
}