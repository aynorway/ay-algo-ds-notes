// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/ 

// 提交成功的代码 
// 正确代码


class Solution {
    public int[] searchRange(int[] a, int target) { // leftmost + right most
        int x = left(a, target);
        int y = right(a, target);
        // if ( x != -1 && y < 0) { y = 0 ;}
        return new int[] { x, y };
    }

    public int left(int[] a, int target) {
        // i j
        int i = 0, j = a.length - 1;
        while (i <= j) { // leftmost
            int m = (i + j) >>> 1;

            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else { // a[m] = target // 只要相等就减小j
                j = m - 1; // i is leftmost
                // return i; // chatgpt告诉我这里应该在while 的外面, 然后i 恒=0. 你说这东西是不是不能信. 唉.// 打脸很快, ChatGPT是对的.
            }
        }
        if (i < a.length && a[i] == target) return i;
        return -1;
    }

    public int right(int[] a, int target) {
        int i = 0, j = a.length - 1;
        while (i <= j) { // rightmost
            int m = (i + j) >>> 1;

            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else { // 1 2 3 3 3 3 4
                i = m + 1; // j is right most
                // return m; // j是大于i那个, i得是j-1.
            }
        }
        if (j >= 0 && a[j] == target) return j;
        return -1;
    }
}

// 比如说数组 
// 1 2 2 2 2 2 2 2 4 5 6 7 
// 序列 Index
// 0 1 2 3 4 5 6 7 8 9 10 11
// 如果要找3,没有,返回-1, 可以理解.


// 注意, i<=j 才开始循环, i比j大, 就重复比较了, 就结束循环. 所以i在j左边才循环, j在i左边, 就结束循环. 
// 那比如说要找2 
// a[m] = target 了 , 一堆2, so j based on m 向左, a[i]可能小于target, 也可能等于target. 
// 如果 target 在左侧, j向左
// j向左, j=m-1, 直到j=i=m, j还减了1, j跑到i左边去了, 

// ——————————————————————

// 在这个例子中，我们可以观察到以下几点：

// 当我们遇到匹配的目标值时，我们总是移动j来向左移动，并试图找到更左侧的匹配值。
// 如果我们遇到一个小于目标的值，我们会移动i来向右移动。
// i和j都可以移动，但是当我们试图找到左边界时，i只会向右移动，而j只会向左移动。
// 由于这种搜索方式，i永远不会错过目标的左边界。无论数组中的目标值有多少，当我们发现一个匹配的目标值时，我们总是使j向左移动，直到找到最左边的匹配值。就是i=j=m的状态?.!.吧. 

// 因此，在寻找左边界时，i将总是找到或者至少移动到目标值的leftmost位置。

// ——————————————————————

// 如果 target 在右侧, i向右 
// i增加, i向右, 直到 i=j=m, i又m+1>j 停止循环. 则j是右边界, i比j大1. 

// i最左, j是target的下一位. 

// ——————————————————————






// 新感悟, 找leftmost时候, 只要值相等, 动的是j, 而且一直动的都是j, a[i]总是小于target值的时候, 才动. 所以顶天是小于目标index,或刚好为第一个目标索引. 不可能超过目标索引. 
// 1 1 2 2 2 4 
// 您的说法是完全正确的。

// 确实，当我们尝试找到`target`的leftmost位置时：
// - 每当`a[m]`等于目标值，我们都会移动`j`，这样我们就会更加接近左边界。
// - 只有当`a[m]`小于目标值时，我们才会移动`i`。这确保了`i`要么会停在leftmost的目标值，要么会停在目标值之前的某个值（也就是小于目标值的值）。

// 这意味着`i`不可能超过目标的左边界，它要么指向leftmost目标值，要么在此之前。

// 您的感悟是准确和清晰的。






// ——————————————————————


