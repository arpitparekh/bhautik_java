public class ArraySortingAlgo {

  public static void main(String[] args) {

    int[] arr = { 8, 0, 65, 98, 5, 4, 5, 8, 3, 7 }; // n

    // selection sort

    for (int i = 0; i < arr.length; i++) {

      for (int j = i + 1; j < arr.length; j++) {

        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;

        }

      }

    }

    for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");

    }

  }

}
