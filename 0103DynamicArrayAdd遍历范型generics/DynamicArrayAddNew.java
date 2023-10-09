import java.util.function.Consumer;

public class DynamicArrayAddNew {

    private int size = 0; // 逻辑大小
    private int capacity = 8; // 容量
    private int[] array = new int[capacity]; // 创建新数组, 默认全是0

    public void addLast(int element) {

        add(size, element);
    }

    public void add(int index, int element) {
        if (index >= 0 && index <= size) { // 考虑边界
            System.arraycopy(array, index, array, index + 1, size - index);
        }
        array[index] = element;
        size++;
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

    // 在只是在做打印一件事, 为了让要做的事不是写死在方法内, 而是, 通过方法的参数传递进来. 修改如下.
    // java就是干这个事的, 合适的做法, 是, 传一个函数式接口.
    // forEach 能提供什么
    // forEach 返回什么

    // 提供的是元素 array[i]
    // 不需要返回值 即 void
    // 满足这样两个条件的函数式接口, 叫Consumer(), 一个参数, 无返回值.
    // 用Consumer, 需要, 泛型（Generics）
    //

    // public void forEach(传一个函数式接口) {
    // for (int i = 0; i < size; i++) {
    // System.out.println(array[i]);
    // // 提供的是元素 array[i]
    // // 不需要返回值 即 void
    // }
    // }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < size; i++) {
            // System.out.println(array[i]);
            // 提供的是元素 array[i]
            // 不需要返回值 即 void
            consumer.accept(array[i]);
            // 把打印的活, 交给consumer来做. 

        }
    }

}
