import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Iterator; // 修改这里

public class DynamicArrayAddNew implements Iterable<Integer> { // 实现Iterable接口

    private int size = 0; // 逻辑大小
    private int capacity = 8; // 容量
    private int[] array = {}; // 改进, 先设置空的数组.

    // 向最后位置[size] 添加 元素
    // params: element - 待添加的元素
    public void addLast(int element) {

        add(size, element);
    }

    // 向[0..size]位置 添加 元素
    // params: index - 索引位置
    // element - 待添加的元素
    public void add(int index, int element) {
        checkAndGrow(); // 重构了, 先检查容量, 容量充足了, 再走下边的逻辑.

        // 添加逻辑
        if (index >= 0 && index <= size) { // 考虑边界
            System.arraycopy(array, index, array, index + 1, size - index);
        }
        array[index] = element;
        size++;
    }
    ////////////////////// 插入涉及数据移动, 插入点后边的得移位, 所以是, O(n), 尾部是O(1), 就算加上扩容, 尾部也是O(1)

    private void checkAndGrow() {
        // 扩容先判定
        // 先检查容量
        if (size == 0) {
            array = new int[capacity]; // 从 0 扩到 8
        }
        // 如果不够, 从不够扩到够
        if (size == capacity) { // 如果size相等, 就扩容1.5 或 1.618, 或 2.
            // capacity = capacity + capacity >> 1;
            capacity += capacity >> 1;
            int[] newArray = new int[capacity];
            System.arraycopy(array, 0, newArray, 0, size); // 把旧的[]放到新的[]
            array = newArray; // 旧的不要了, 用新的盖上
        }
    }

    // 从[0..size)范围 删除 元素
    // params: index - 索引位置
    // returns: 被删除的元素
    public int remove(int index) { // [0.. size)
        int removed = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        return removed;

    }
    ////////////////////// 与插入相同 

    // 查询元素
    // [0..size)区间内
    // params: index - 索引位置
    // returns: 该索引位置的元素
    public int get(int index) {
        return array[index];
    }

    // 知道 类内部用了静态数组, 还知道 有效元素的大小 --》 就可以 写遍历 了 [卧槽?]
    // 遍历方法1
    // Params: consumer - 遍历要执行的操作, 入参:每个元素
    public void forEach1() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);

        }
    }
    ////////////////////// 根据索引去查询, 是, O(1), 与数据规模无关了

    public void forEach2(Consumer<Integer> consumer) {
        for (int i = 0; i < size; i++) {
            // System.out.println(array[i]);
            // 提供的是元素 array[i]
            // 不需要返回值 即 void
            consumer.accept(array[i]);
            // 把打印的活, 交给consumer来做.

        }
    }
    ////////////////////// 根据索引去查询, 是, O(1), 与数据规模无关了

    public Iterator<Integer> iterator() {
        // 异名内部类写法
        return new Iterator<Integer>() {
            int i = 0;

            public boolean hasNext() { // if there is next element
                return i < size;
            }

            public Integer next() {
                return array[i++];
            }

        };
    }

    public IntStream stream() {
        // return IntStream.of(array); // 全打印出来了
        return IntStream.of(Arrays.copyOfRange(array, 0, size)); // 只写有效的

    }

}
