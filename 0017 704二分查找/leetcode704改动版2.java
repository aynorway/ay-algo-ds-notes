// https://leetcode.com/problems/binary-search/description/ 


class Solution {
    public int search(int[] a, int target) {
        int i = 0, j = a.length; 

        while (i + 1 < j) { //平衡版 
            //中间索引 
            int m = (i+j) >>> 1;
            
            if (target < a[m]) { // 左边
                j = m; 
            } else { 
                i = m ; // m还没测 
            } 
        }
        return (a[i] == target) ? i : -1 ; // 一个值的时候, 三元运算符 // 条件? 结果1 : 结果2 

    }


// i m j 
// when i=j may also be m, so shouldn't jump out the loop. 
// so i<=j 



// 考虑这个更小的例子：a = [1, 2] 并且 target = 0。

// 在第一次迭代中，i=0, j=1, m=0，因为target < a[0]，所以 j = m; 会导致j变为0。
// 在第二次迭代中，i=0, j=0, m=0，然后再次，因为target < a[0]，所以j = m; 会导致j仍然保持为0。
// 在这种情况下，代码会陷入无限循环。

// 所以我的原点仍然有效：为了确保搜索范围每次都会减小，我们需要排除中点。这就是为什么我们使用 j = m - 1 而不是 j = m 的原因。




