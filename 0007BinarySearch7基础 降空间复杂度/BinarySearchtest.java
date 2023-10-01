public class BinarySearchtest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;
        int result = BinarySearch.binarySearchBasic(arr, target);
        System.out.println("Target is " + target + ", found at index: " + result);

        int[] arr1 = { 10, 18, 22, 30 };
        int target1 = 22;
        int result1 = BinarySearch.binarySearchBasic(arr1, target1);
        System.out.println("Target is " + target1 + ", found at index: " + result1);

        int[] arr2 = { 2, 5, 8 };
        int target2 = 9;
        int result2 = BinarySearch.binarySearchBasic(arr2, target2);
        System.out.println("Target is " + target2 + ", found at index: " + result2);

    }

}
