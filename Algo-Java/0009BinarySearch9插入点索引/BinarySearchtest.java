import java.util.Arrays;

public class BinarySearchtest {
    public static void main(String[] args) {
        int[] a = { 2, 5, 8 };
        int target = 4;
        int i = Arrays.binarySearch(a, target);
        System.out.println(i);

        int target2 = 9;
        int i1 = Arrays.binarySearch(a, target2);
        System.out.println(i1);

        if (i < 0) {
            int insertIndex = Math.abs(i + 1); // 插入点索引
            int[] b = new int[a.length + 1];
            System.arraycopy(a, 0, b, 0, insertIndex);
            b[insertIndex] = target;
            System.out.println(Arrays.toString(b));
            System.arraycopy(a, insertIndex, b, insertIndex + 1, a.length - insertIndex);
            System.out.println(Arrays.toString(b));
        }
    }

}
