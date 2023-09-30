import java.util.Arrays;

public class BinarySearchtest {
    public static void main(String[] args) {
        int[] a = { 2, 5, 8 };
        int target = 1;
        int i = Arrays.binarySearch(a, target);
        System.out.println(i);

        int target2 = 9;
        int i1 = Arrays.binarySearch(a, target2);
        System.out.println(i1);

        System.out.println(0 == -0);
    }

}
