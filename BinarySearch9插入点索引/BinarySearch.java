public class BinarySearch {
    // Params: a数组，int target 目标值
    // returns: 目标索引，没找到返回-1

    public static int binarySearchBasic(int[] a, int target) {
        int i = 0;
        int j = a.length;

        while (i < j - 1) { // 还剩下一个i指向的元素的时候,退出循环. 
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m ;
            } else if (a[m] < target) {
                i = m ;
            } else {
                return m;
            }
        }
        if (a[i] == target){
            return i;
        } else
        return -1;
    }
}

// O(log(n)) 
