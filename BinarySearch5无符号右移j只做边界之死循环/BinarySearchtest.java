public class BinarySearchtest {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int target = 5;
    int result = BinarySearch.binarySearchBasic(arr, target);
    System.out.println("Target is " + target + ", found at index: " + result);

    }
    // public static void main(String[] args) {
    //     int i = 0; 
    //     int j = Integer.MAX_VALUE -1; 
    //     int m = (i + j)/2; 
    //     System.out.println(m);
    //     i = m + 1; 
    //     System.out.println(i);
    //     System.out.println(j);
    //     System.out.println(i+j);
        
    //     m = (i+j)/2; 
    //     System.out.println(m);

    // }

}
