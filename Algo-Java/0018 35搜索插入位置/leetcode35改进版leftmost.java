
// m, i, 和 j 都是数组索引，而m是当前正在检查的元素的索引，i和j是当前搜索范围的开始和结束索引。

class Solution {
    public int searchInsert(int[] a, int target) {
        int i = 0; 
        int j = a.length - 1; 

        while ( i <= j ) { // if find 
            int m = (i + j) >>> 1; // 放在while里面, 原因是在二分搜索中，你需要在每次循环迭代中重新计算中间索引 m，因为 i 和 j 的值可能会改变。

            if (target < a[m]) {
                // i no change 
                j = m - 1;
            } else if (a[m] < target) { 
                i = m + 1; 
            } else { // if (a[m] = target)
            return m; 
            }
        } // if not find 

        return i;  

    }
}
// 还是不够熟练, 然后写错了三四遍, 出现了超时错误. 最后一次对了. 边界j = m - 1; 处分析错了. 最后也做出来, 但是慢. 

// i x x y y y x x m-1 m m+1 x x x x j 
// a[0]         a[m]          a[j-1]
//      target        target
