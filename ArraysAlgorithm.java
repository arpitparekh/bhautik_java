public class ArraysAlgorithm {

  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // n

    int value = 1;

    // searching in array

    // linear search
    // binary search

    for (int i = 0; i < arr.length; i++) { // linear search // O(n)
      if (arr[i] == value) {
        System.out.println("Found at index " + i);
        break;
      }
    }

    // binary search // data sorted
    // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    int start = 0;
    int end = arr.length - 1;
    int mid = (start + end) / 2;

    while (start <= end) {

      if (value == arr[mid]) {
        System.out.println("Found at index " + mid);
        break;
      } else if (value < arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }

      mid = (start + end) / 2;

    }

  }

}
