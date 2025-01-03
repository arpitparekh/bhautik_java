public class ArrayFindMin {

  public static void main(String[] args) {

    int arr[] = { 1, 2, 4, 67, 4, -3, 45, 6, 1, 5, 8, 0 };

    // find minimum element in the array

    int min = arr[0];  // 1

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }

    System.out.println("Min element is " + min);

  }

}
