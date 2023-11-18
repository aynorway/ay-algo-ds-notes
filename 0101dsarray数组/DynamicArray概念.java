public class DynamicArray {

    // 数组中元素 得一致 
    // 数组中元素是连续存储的, 用索引 i 就可以计算元素的地址 
    // 0 1 2 3 4
    // b b+4 b+8 b+12 等等等
    // int 占4 , double 占8 
    // byte[] array = {x, x, x, x, xxxxxx }

    // 性能, java中, 空间占用 
    // markword 8字节
    // 类指针 4 字节
    // 4 字节 数组size (数组最大容量是2的32次方)
    // 数组元素 + 对齐字节  

    // 随机访问 与数据规模无关 所以O(1)

    // 自带的数组不能 插入和删除元素, 大小也不能改, 叫做静态数组 
    // 可以改的叫做动态数组 

    // 动态数组
    // 0 1 2 3 4 5 6 7 八个元素 
    // size 逻辑大小 
    // 扩容的话 加入新数组 
    // 

    // private int[] array;
    private int size = 0; // 逻辑大小
    private int capacity = 8; // 容量
    private int[] array = new int[capacity]; // 创建新数组, 默认全是0 
    
}
