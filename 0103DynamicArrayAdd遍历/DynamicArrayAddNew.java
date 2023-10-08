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
    // public void forEach(传一个函数式接口) {
    //     for (int i = 0; i < size; i++) {
    //         System.out.println(array[i]);
    //         // 提供array[i]
    //         // 返回 void 
    //     }
    // }

    public void forEach () {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
            
        }
    }



}
