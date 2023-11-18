public class DynamicArrayAdd {

    // private int[] array;
    // 数组三要素
    private int size = 0; // 逻辑大小
    private int capacity = 8; // 容量
    private int[] array = new int[capacity]; // 创建新数组, 默认全是0

    // 先插入最后一个
    public void addLast(int element) {
        array[size] = element;
        size++;
    }

    // 再插入中间部分 
    public void add(int index, int element) {
        if (index >= 0 && index <= size)
            System.arraycopy(array, index, array, index + 1, size - index);
        // 从原始数组, 起始位置, 到新数组, 起始位置, 拷贝几位
        array[index] = element;
        size++;
    }

}
