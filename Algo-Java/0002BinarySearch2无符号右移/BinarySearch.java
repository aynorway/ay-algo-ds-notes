public class BinarySearch {
    // Params: a数组，int target 目标值
    // returns: 目标索引，没找到返回-1

    public static int binarySearchBasic(int[] a, int target) {
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}