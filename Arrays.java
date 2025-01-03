

public class Arrays {

  public static void main(String[] args) {

    // arrays
    // group of similar type of elements
    int[] arr = { 1, 2, 4, 67, 4, 3, 45, 6 };   // reference datatype
    //            0 ,1 ,2 ,3 ,4   5,  6  7
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);

    int[][] arr2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // 2d array

    System.out.println(arr2[2][0]);

    System.out.println(arr.length);;

    for(int i=0;i<arr.length;i++){  // 0..7
      System.out.print(arr[i]+" ");
    }

  }

}
