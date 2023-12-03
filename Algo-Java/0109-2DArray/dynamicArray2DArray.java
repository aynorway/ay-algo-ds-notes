public class dynamicArray2DArray {

    // 执行效率不一样
    
    public static void ij(int[][] a, int rows, int columns) {
        long sum = 0L;
        for (int i = 0; i< rows; i++) {
            for (int j = 0; j< columns; j++) {
                sum += a[i][j];
            } 
        }
        System.out.println(sum);
    }
    
    public static void ji(int[][] a, int rows, int columns) {
        long sum = 0L; 
        for (int j = 0; j< columns; j++) { 
            for (int i = 0; i < rows; i++) {
                sum += a[i][j];
            } 
            System.out.println(sum);
        }
    }

    // public static void main(String[] args) {
    //     int rows = 1000000; 
    //     int columns = 14;  
    //     int[][] a = new int[rows][columns];
        
    //     StopWatch sw = new StopWatch();
        
    //     sw. start( taskName: "ij");  
    //     ij(a, rows, columns);  
    //     sw.stop();
        
    //     sw. start( taskName: "ji");  
    //     ji(a, rows, columns);  
    //     sw.stop();
        
    //     System.out.println(sw.prettyPrint());
    // }

    // 没有stopwatch, 需要spring 

    public static void main(String[] args) {
        int rows = 1000000; 
        int columns = 14;  
        int[][] a = new int[rows][columns];

        long startTime, endTime;
        
        startTime = System.nanoTime();
        ij(a, rows, columns);
        endTime = System.nanoTime();
        System.out.println("Time for ij: " + (endTime - startTime) + " nanoseconds");
        
        startTime = System.nanoTime();
        ji(a, rows, columns);
        endTime = System.nanoTime();
        System.out.println("Time for ji: " + (endTime - startTime) + " nanoseconds");
    }
}

// 二维数组 2 d array 
// int[][] array = {
//     {...}
//     {...}
//     {...}
//     {...}
//     //...
// }

// markword 8, cp 类指针 4, size 4, [0],[1],[2]......[对齐内存]
// 定位, 两次索引, array[i][j]  i是外层 j是内层 

// cpu 读内存 纳秒 10 -9 次方 
// 运算速度 皮秒 10 -12 次方 
// 所以读的慢
// 所以加一个缓存 缓存没有, 去内存找 提升cpu效率 

// 内存中的数据存到缓存里的, 存多少 
// 凑 64 字节 , 也叫缓存一行, cache line, 缓存读写的最小单位 
// 读内存时候, 凑一个缓存行, 叫 空间局部性 

// 分析效率 
// ij 效率高 
// 除了读[0][0], 还得读[0][1], [0][2], 大约到[0][十几], 就是64 字节 
// 所以在找[0][1]的时候, 缓存中就有了 (即, 后面可以 充分 利用缓存)
// 读到[1][0], 缓存没有了, 再输入一行到缓存. 

// ji, 效率低 
// 除了读[0][0], 还得读[0][1], [0][2], 大约到[0][十几], 就是64 字节 
// 然后没有[1][0]
// 后续的缓存, 都没有利用上
