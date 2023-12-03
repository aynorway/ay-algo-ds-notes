public class LinearSearch {
    // Params: a数组 int target 目标值
    // returns: 目标索引，没找到返回-1

    public static int linearSearch(int[] a, int target) {
        for (int i = 0; i < a.length; i++){
            if (a[i] == target){
                return i;
            }
        }
        return -1; // 在范围内没有结果
    }
}