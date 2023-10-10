import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Iterator; // 修改这里

public class DynamicArrayAddNew implements Iterable<Integer> { // 实现Iterable接口

    private int size = 0; // 逻辑大小
    private int capacity = 8; // 容量
    private int[] array = new int[capacity]; // 创建新数组, 默认全是0

    // 向最后位置[size] 添加 元素
    // params: element - 待添加的元素 
    public void addLast(int element) {

        add(size, element);
    }

    // 向[0..size]位置 添加 元素
    // params: index - 索引位置
    //         element - 待添加的元素 
    public void add(int index, int element) {
        
        

        // 添加逻辑 
        if (index >= 0 && index <= size) { // 考虑边界
            System.arraycopy(array, index, array, index + 1, size - index); 
        }
        array[index] = element;
        size++;
    }

    public int remove (int index) { // [0.. size)
        int removed = array [index]; 
        System.arraycopy(array, index + 1, array, index, size - index - 1); 
        size--;
        return removed; 

    }

    public int get(int index) {
        return array[index];
    }

    // 知道 类内部用了静态数组, 还知道 有效元素的大小 --》 就可以 写遍历 了 [卧槽?]

    public void forEach1() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);

        }
    }

    public void forEach2(Consumer<Integer> consumer) {
        for (int i = 0; i < size; i++) {
            // System.out.println(array[i]);
            // 提供的是元素 array[i]
            // 不需要返回值 即 void
            consumer.accept(array[i]);
            // 把打印的活, 交给consumer来做.

        }
    }

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
