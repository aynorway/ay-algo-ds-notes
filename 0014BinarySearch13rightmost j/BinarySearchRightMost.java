public class BinarySearchRightMost {
    // Params: a数组，int target 目标值
    // returns: 目标索引，没找到返回-1

    public static int binarySearchRightMost(int[] a, int target) {
        int i = 0;
        int j = a.length - 1;

        while (i <= j) {
            int m = (i + j) >>> 1;
            // comparison
            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] <= target) {
                i = m + 1;
            }
        }
        return i - 1; // <= target, 最靠右的索引 
        // 其实就是return 的 j

    }
}

// Value
// 1 2 4 4 4 6 7 8 
//      a[m]
// Index
// 0 1 2 3 4 5 6 7
// i             j
//       m 


// go to find the right most index 
// i start of the array 
// j the end of the array 
// candidate, initialized as -1, to indicate there is no candidate. 

// as long as i less than or equal to j, loop continues

// target is a[m] 

// m is midpoint (i+j >>> 1 )

// comparisons // to narrow down the range // to reduce the scope 
// a[m] 
// target < a[m], j=m
// a[m] < target, i=m 
// a[m] = target, find the target, a[m], candidate = m, i is the most left index number. 
// we to make i bigger, i -> m + 1, unitl a[m] is not = target, i cannot be bigger, then end the loop. and we get i. (we are controlling the scope) 

// if not find, the candidate = -1 


