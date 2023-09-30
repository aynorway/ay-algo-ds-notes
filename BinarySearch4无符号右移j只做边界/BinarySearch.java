public class BinarySearch {
    // Params: a数组，int target 目标值
    // returns: 目标索引，没找到返回-1

    public static int binarySearchBasic(int[] a, int target) {
        int i = 0, j = a.length;  // 现在设定两个指针 // 变一行 // 在范围内有结果 // j 只做边界, 就一定不是查找目标
        
        while (i < j) { 
            int m = (i + j) >>> 1; // 找一个中间的位置 
            // unsigned right shift operator (0+7)>>>1 = 3 
            if (target < a[m]) { // 如果目标在左边
                j = m ;
            } else if (a[m] < target) { // 如果目标在右边
                i = m + 1;
            } else {
                return m; // 如果目标在中间
            }
        }
        return -1; // 在范围内没有结果
    }
}