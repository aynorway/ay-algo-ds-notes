
public class BinarySearchtest {
    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 4, 4, 6, 6, 8 };
        int target = 4;
        int i = BinarySearchLeftMost.binarySearchLeftMost(a, target);
        System.out.println(i);

        int target1 = 6;
        int i1 = BinarySearchLeftMost.binarySearchLeftMost(a, target1);
        System.out.println(i1);

        int target2 = 5;
        int i2 = BinarySearchLeftMost.binarySearchLeftMost(a, target2);
        System.out.println(i2);
    }

}
