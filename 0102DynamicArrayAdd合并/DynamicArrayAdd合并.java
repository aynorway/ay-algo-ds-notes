public class DynamicArrayAdd {

    // private int[] array;
    // 数组三要素
    private int size = 0; // 逻辑大小
    private int capacity = 8; // 容量
    private int[] array = new int[capacity]; // 创建新数组, 默认全是0

    public void addLast(int element) {
        array[size] = element;
        size++;
        add(size, element); // 加上调用 
    }

    // public void add(int index, int element) {
    //     if (index >= 0 && index <= size) { // 考虑边界
    //         System.arraycopy(array, index, array, index + 1, size - index);
    //         // 从原始数组, 起始位置, 到新数组, 起始位置, 拷贝几位
    //         array[index] = element;
    //         size++;
    //     } else if (index == size) {
    //         array[size] = element;
    //         size++;
    //     }
    // }

    // 合并后 变成一个了, 没原始的直观, 但是可以用, 等于约分了. 

    public void add(int index, int element) {
        if (index >= 0 && index <= size) { // 考虑边界
            System.arraycopy(array, index, array, index + 1, size - index);
            // 从原始数组, 起始位置, 到新数组, 起始位置, 拷贝几位

        }
        array[index] = element;
        size++;
    }

}
