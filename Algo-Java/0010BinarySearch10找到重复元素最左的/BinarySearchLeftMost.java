public class BinarySearchLeftMost {
    // Params: a数组，int target 目标值
    // returns: 目标索引，没找到返回-1

    public static int binarySearchLeftMost(int[] a, int target) {
        int i = 0;
        int j = a.length - 1;
        int candidate = -1; // 确定一个候选者, 在-1的情况下意味着没有候选者

        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                // 记录候选位置
                candidate = m; // 更新候选位置 
                j = m - 1; // 缩小边界 
            }
        }
        return candidate; // 最靠左的元素位置 
    }
}