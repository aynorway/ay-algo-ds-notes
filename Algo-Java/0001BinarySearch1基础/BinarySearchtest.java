public class BinarySearchtest {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int target = 5;
    int result = BinarySearch.binarySearchBasic(arr, target);
    System.out.println("Target is " + target + ", found at index: " + result);
    }

}
